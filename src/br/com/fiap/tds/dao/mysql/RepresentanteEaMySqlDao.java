package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.tds.dao.RepresentanteEaDao;
import br.com.fiap.tds.to.RepresentanteEaTo;

public class RepresentanteEaMySqlDao implements RepresentanteEaDao{

	public Connection conexao;
	
	public RepresentanteEaMySqlDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(RepresentanteEaTo repEa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RepresentanteEaTo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(RepresentanteEaTo repEa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) {
		// TODO Auto-generated method stub
		
	}

}
