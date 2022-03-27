package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.RepresentanteSmDao;
import br.com.fiap.tds.to.RepresentanteSmTo;

public class RepresentanteSmMySqlDao implements RepresentanteSmDao{

	public Connection conexao;
	
	public RepresentanteSmMySqlDao(Connection conexao) throws SQLException  {
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(RepresentanteSmTo repSm) throws SQLException  {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RepresentanteSmTo> listar() throws SQLException  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(RepresentanteSmTo repSm) throws SQLException  {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) {
		// TODO Auto-generated method stub
		
	}

}
