package br.com.fiap.tds.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.dao.SupermercadoDao;
import br.com.fiap.tds.to.EnderecoTo;
import br.com.fiap.tds.to.SupermercadoTo;

public class SupermercadoOracleDao implements SupermercadoDao{

	private Connection conexao;
	
	public SupermercadoOracleDao(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void cadastrar(SupermercadoTo supermercado) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("INSERT into t_fdr_supermercado(cd_supermercado,nr_cep,"
				+ "nm_supermercado,nr_telefone, ds_email, nr_cnpj) values (?,?,?,?,?,?)");
		
		//Setar os valores no banco de dados
		pstmt.setInt(1, supermercado.getCodSupermercado());
		pstmt.setInt(2, supermercado.getEndereco().getCep());
		pstmt.setString(3, supermercado.getNome());
		pstmt.setInt(4, supermercado.getTelefone());
		pstmt.setString(5, supermercado.getEmail());
		pstmt.setInt(6, supermercado.getCnpj());
		
		//Executar a query
		pstmt.executeUpdate();
	}

	@Override
	public List<SupermercadoTo> listar() throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("Select * from t_fdr_supermercado");
		
		//Executar o comando
		ResultSet result = pstmt.executeQuery();
		
		return parseList(result);
	}
	
	private List<SupermercadoTo> parseList(ResultSet result) throws SQLException {
		List<SupermercadoTo> lista = new ArrayList<>();
		//Ler os registros
		while (result.next()) {
			SupermercadoTo supermercado = parse(result);
			//Adicionar na lista
			lista.add(supermercado);
		}
		return lista;
	}
	
	private SupermercadoTo parse(ResultSet result) throws SQLException {
		int codigo = result.getInt("cd_supermercado");
		int cep = result.getInt("nr_cep");
		String nome = result.getString("nm_supermercado");
		int telefone = result.getInt("nr_telefone");
		String email = result.getString("ds_email");
		int cnpj = result.getInt("nr_cnpj");
		
		SupermercadoTo sm = new SupermercadoTo(codigo, nome, telefone, cnpj, email);
		sm.setEndereco(new EnderecoTo(cep));
		return sm;
	}

	@Override
	public void atualizar(SupermercadoTo supermercado) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("UPDATE t_fdr_supermercado set "
				+ "nr_cep = ?, nm_supermercado = ?, nr_telefone = ?, ds_email = ? , nr_cnpj = ? where cd_supermercado = ?");
		
		pstmt.setInt(1, supermercado.getEndereco().getCep());
		pstmt.setString(2, supermercado.getNome());
		pstmt.setInt(3, supermercado.getTelefone());
		pstmt.setString(4, supermercado.getEmail());
		pstmt.setInt(5, supermercado.getCnpj());
		pstmt.setInt(6, supermercado.getCodSupermercado());
		
		pstmt.executeUpdate();
		pstmt.close();		
	}

	@Override
	public void remover(int codigo) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("DELETE from t_fdr_supermercado where "
				+ "cd_supermercado = ?");
		
		pstmt.setInt(1, codigo);
		
		pstmt.executeUpdate();		
	
	}
	
	
}
