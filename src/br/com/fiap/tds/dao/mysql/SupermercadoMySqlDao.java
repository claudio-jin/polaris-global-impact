package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.SupermercadoDao;
import br.com.fiap.tds.to.SupermercadoTo;

public class SupermercadoMySqlDao implements SupermercadoDao{

	public Connection conexao;
	
	public SupermercadoMySqlDao(Connection conexao) throws SQLException{
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(SupermercadoTo supermercado) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupermercadoTo> listar() throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(SupermercadoTo supermercado) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws SQLException{
		// TODO Auto-generated method stub
		
	}

}
