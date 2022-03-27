package br.com.fiap.tds.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.to.EnderecoTo;

public class EnderecoOracleDao implements EnderecoDao{

	private Connection conexao;
	
	public EnderecoOracleDao(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void cadastrar(EnderecoTo endereco) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("INSERT into t_fdr_endereco"
				+ "(nr_cep, sg_estado, nm_cidade, nm_logradouro, nr_logradouro, nm_bairro,"
				+ "ds_complemento) values (?, ?, ?, ?, ?, ?, ?)");
		
		pstmt.setInt(1, endereco.getCep());
		pstmt.setString(2, endereco.getSiglaEstado());
		pstmt.setString(3, endereco.getNomeCidade());
		pstmt.setString(4, endereco.getLogradouro());
		pstmt.setInt(5, endereco.getNumero());
		pstmt.setString(6, endereco.getBairro());
		pstmt.setString(7, endereco.getComplemento());
		
		pstmt.executeUpdate();
	}

	@Override
	public List<EnderecoTo> listar() throws SQLException{
		PreparedStatement pstmt = conexao.prepareStatement("Select * from t_fdr_endereco");
		
		//Executar o comando
		ResultSet result = pstmt.executeQuery();
		
		return parseList(result);
	}
	
	private List<EnderecoTo> parseList(ResultSet result) throws SQLException {
		List<EnderecoTo> lista = new ArrayList<>();
		//Ler os registros
		while (result.next()) {
			EnderecoTo endereco = parse(result);
			//Adicionar na lista
			lista.add(endereco);
		}
		return lista;
	}
	
	private EnderecoTo parse(ResultSet result) throws SQLException {
		int cep = result.getInt("nr_cep");
		String sigla = result.getString("sg_estado");
		String cidade = result.getString("nm_cidade");
		String logradouro = result.getString("nm_logradouro");
		int numLogradouro = result.getInt("nr_logradouro");
		String nomeBairro = result.getString("nm_bairro");
		String complemento = result.getString("ds_complemento");
		
		EnderecoTo endereco = new EnderecoTo(logradouro, numLogradouro, cep, sigla, nomeBairro, complemento, cidade);
		return endereco;
	} 

	@Override
	public void atualizar(EnderecoTo endereco) throws SQLException {
		PreparedStatement pstmt = conexao.prepareStatement("UPDATE t_fdr_endereco set "
				+ "sg_estado = ?, nm_cidade = ?, nm_logradouro = ?, nr_logradouro = ?, nm_bairro = ?,"
				+ "ds_complemento = ? where nr_cep = ?");
		
		pstmt.setString(1, endereco.getSiglaEstado());
		pstmt.setString(2, endereco.getNomeCidade());
		pstmt.setString(3, endereco.getLogradouro());
		pstmt.setInt(4, endereco.getNumero());
		pstmt.setString(5, endereco.getBairro());
		pstmt.setString(6, endereco.getComplemento());
		pstmt.setInt(7, endereco.getCep());
		
		pstmt.executeUpdate();
		pstmt.close();
	
	}

	@Override
	public void remover(int codigo) throws SQLException{
		PreparedStatement pstmt = conexao.prepareStatement("DELETE from t_fdr_endereco where "
				+ "nr_cep = ?");
		
		pstmt.setInt(1, codigo);
		
		pstmt.executeUpdate();
	}
	
	
}
