package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.EntidadeDao;
import br.com.fiap.tds.to.EntidadesTo;

public class EntidadeMySqlDao implements EntidadeDao{

	public Connection conexao;
	
	public EntidadeMySqlDao(Connection conexao) throws SQLException{
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(EntidadesTo entidade) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EntidadesTo> listar() throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(EntidadesTo entidade) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws SQLException{
		// TODO Auto-generated method stub
		
	}

}
