package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.to.EnderecoTo;

public class EnderecoMySqlDao implements EnderecoDao{

	public Connection conexao;
	
	public EnderecoMySqlDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(EnderecoTo endereco) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EnderecoTo> listar() throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(EnderecoTo endereco) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws SQLException{
		// TODO Auto-generated method stub
		
	}

}
