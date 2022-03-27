package br.com.fiap.tds.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.dao.EntidadeDao;
import br.com.fiap.tds.to.EnderecoTo;
import br.com.fiap.tds.to.EntidadesTo;

public class EntidadeOracleDao implements EntidadeDao{
	private Connection conexao;
	
	public EntidadeOracleDao(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void cadastrar(EntidadesTo entidade) throws SQLException {
		PreparedStatement pstmt  = conexao.prepareStatement("INSERT into t_fdr_entidade ("
				+ "cd_instituicao, nr_cep, nm_instituicao, nr_telefone, ds_email) values (?,?,?,?,?)");
		
		pstmt.setInt(1, entidade.getCodigo());
		pstmt.setInt(2, entidade.getEndereco().getCep());
		pstmt.setString(3, entidade.getNome());
		pstmt.setInt(4, entidade.getTelefone());
		pstmt.setString(5, entidade.getEmail());
		
		pstmt.executeUpdate();		
	}

	@Override
	public List<EntidadesTo> listar() throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("Select * from t_fdr_entidade");
		
		//Executar o comando
		ResultSet result = pstmt.executeQuery();
		
		return parseList(result);
	}
	
	private List<EntidadesTo> parseList(ResultSet result) throws SQLException {
		List<EntidadesTo> lista = new ArrayList<>();
		//Ler os registros
		while (result.next()) {
			EntidadesTo entidade = parse(result);
			//Adicionar na lista
			lista.add(entidade);
		}
		return lista;
	}
	
	private EntidadesTo parse(ResultSet result) throws SQLException {
		int codigo = result.getInt("cd_instituicao");
		int cep = result.getInt("nr_cep");
		String nome = result.getString("nm_supermercado");
		int telefone = result.getInt("nr_telefone");
		String email = result.getString("ds_email");
		
		EntidadesTo entidade = new EntidadesTo(codigo, nome, telefone, email);
		entidade.setEndereco(new EnderecoTo(cep));
		return entidade;
	}

	@Override
	public void atualizar(EntidadesTo entidade) throws SQLException {
		PreparedStatement pstmt  = conexao.prepareStatement("UPDATE t_fdr_entidade set "
				+ "nr_cep = ?, nm_supermercado = ?, nr_telefone = ?, ds_email = ?"
				+ "where cd_instituicao = ?");
		
		pstmt.setInt(1, entidade.getEndereco().getCep());
		pstmt.setString(2, entidade.getNome());
		pstmt.setInt(3, entidade.getTelefone());
		pstmt.setString(4, entidade.getEmail());
		pstmt.setInt(5, entidade.getCodigo());
		
		pstmt.executeUpdate();
		pstmt.close();
	}

	@Override
	public void remover(int codigo) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("DELETE from t_fdr_entidade where"
				+ "cd_instituicao = ?");
		
		pstmt.setInt(1, codigo);
		
		pstmt.executeUpdate();		
	}
	
	
}
