package br.com.fiap.tds.dao.oracle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.dao.ProdutosDao;
import br.com.fiap.tds.to.ProdutoTo;

public class ProdutoOracleDao implements ProdutosDao{

	private Connection conexao;
	
	public ProdutoOracleDao(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void cadastrar(ProdutoTo produto) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("INSERT into t_fdr_produto("
				+ "cd_produto, nm_produto, qt_produto, dt_fabricacao, dt_validade) values"
				+ "(?,?,?,?,?)");
		
		Date datafb = Date.valueOf(produto.getDtFab().toString());
		Date datavenc = Date.valueOf(produto.getDtVenc().toString());
		
		pstmt.setInt(1, produto.getCodigo());
		pstmt.setString(2, produto.getNome());
		pstmt.setInt(3, produto.getQuantidade());
		pstmt.setDate(4, datafb);
		pstmt.setDate(5, datavenc);
		
		pstmt.executeUpdate();
		
	}

	@Override
	public List<ProdutoTo> listar() throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("Select * from t_fdr_produto");
		
		//Executar o comando
		ResultSet result = pstmt.executeQuery();		
		return parseList(result);
	}
	
	private List<ProdutoTo> parseList(ResultSet result) throws SQLException {
		List<ProdutoTo> lista = new ArrayList<>();
		//Ler os registros
		while (result.next()) {
			ProdutoTo produto = parse(result);
			//Adicionar na lista
			lista.add(produto);
		}
		return lista;
	}
	
	private ProdutoTo parse(ResultSet result) throws SQLException {
		
		int codigo = result.getInt("cd_produto");
		String nome = result.getString("nm_produto");
		int qtd = result.getInt("qt_produto");
		LocalDate dataFab = result.getDate("dt_fabricacao").toLocalDate();
		LocalDate dataVenc = result.getDate("dt_validade").toLocalDate();
		
		ProdutoTo produto = new ProdutoTo(codigo, nome, qtd, dataFab, dataVenc);
		return produto;
	} 
	

	@Override
	public void atualizar(ProdutoTo produto) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("UPDATE t_fdr_produto set "
				+ "nm_produto = ?, qt_produto = ?, dt_fabricacao = ?,"
				+ "dt_validade = ? where cd_produto = ?");
		
		Date datafb = Date.valueOf(produto.getDtFab().toString());
		Date datavenc = Date.valueOf(produto.getDtVenc().toString());
		
		pstmt.setString(1, produto.getNome());
		pstmt.setInt(2, produto.getQuantidade());
		pstmt.setDate(3, datafb);
		pstmt.setDate(4, datavenc);
		pstmt.setInt(5, produto.getCodigo());
		
		pstmt.executeUpdate();
		pstmt.close();
	}

	@Override
	public void remover(int codigo) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("DELETE from t_fdr_produto where "
				+ "cd_produto = ?");		
	
		pstmt.setInt(1, codigo);
		
		pstmt.executeUpdate();
	}

	
}


