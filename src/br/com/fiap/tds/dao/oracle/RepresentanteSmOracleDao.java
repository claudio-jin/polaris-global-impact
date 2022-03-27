package br.com.fiap.tds.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.dao.RepresentanteSmDao;
import br.com.fiap.tds.to.RepresentanteSmTo;
import br.com.fiap.tds.to.SupermercadoTo;

public class RepresentanteSmOracleDao implements RepresentanteSmDao{

	private Connection conexao;
	
	public RepresentanteSmOracleDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	@Override
	public void cadastrar(RepresentanteSmTo repSm) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("INSERT into t_fdr_repre_sm ("
				+ "cd_representante, cd_supermercado, nm_representante, nr_telefone, ds_email)"
				+ "values (?,?,?,?,?)");
		
		pstmt.setInt(1, repSm.getCodigo());
		pstmt.setInt(2, repSm.getSupermercado().getCodSupermercado());
		pstmt.setString(3, repSm.getNome());
		pstmt.setInt(4, repSm.getTelefone());
		pstmt.setString(5, repSm.getEmail());
		
		pstmt.executeUpdate();		
	}

	@Override
	public List<RepresentanteSmTo> listar() throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("Select * from t_fdr_repre_sm");
		
		//Executar o comando
		ResultSet result = pstmt.executeQuery();
		
		return parseList(result);
	}
	
	private List<RepresentanteSmTo> parseList(ResultSet result) throws SQLException {
		List<RepresentanteSmTo> lista = new ArrayList<>();
		//Ler os registros
		while (result.next()) {
			RepresentanteSmTo rep = parse(result);
			//Adicionar na lista
			lista.add(rep);
		}
		return lista;
	}
	
	private RepresentanteSmTo parse(ResultSet result) throws SQLException {
		int cod = result.getInt("cd_representante");
		int codSupermercado = result.getInt("cd_supermercado");
		String nomeRep = result.getString("nm_representante");
		int telefone = result.getInt("nr_telefone");
		String email = result.getString("ds_email");

		RepresentanteSmTo rep = new RepresentanteSmTo(cod, nomeRep, telefone, email);
		rep.setSupermercado(new SupermercadoTo(codSupermercado));
		return rep;
		
	} 
	

	@Override
	public void atualizar(RepresentanteSmTo repSm) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("UPDATE t_fdr_repre_sm set "
				+ "cd_supermercado = ?, nm_representante = ?, nr_telefone = ?,"
				+ "ds_email = ? where cd_representante = ?");
		
		pstmt.setInt(1, repSm.getSupermercado().getCodSupermercado());
		pstmt.setString(2, repSm.getNome());
		pstmt.setInt(3, repSm.getTelefone());
		pstmt.setString(4, repSm.getEmail());
		pstmt.setInt(5, repSm.getCodigo());
		
		pstmt.executeUpdate();		
		pstmt.close();
	}

	
	
	
	@Override
	public void remover(int codigo) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("DELETE from t_fdr_repre_sm where"
				+ "cd_representante = ?");
		
		pstmt.setInt(1, codigo);
		
		pstmt.executeUpdate();		
	}

	
	
	
	
}
