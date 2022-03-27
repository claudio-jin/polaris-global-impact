package br.com.fiap.tds.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.SupermercadoDao;
import br.com.fiap.tds.factory.DaoFactory;
import br.com.fiap.tds.to.SupermercadoTo;

public class SupermercadoBo {

	private SupermercadoDao supermercadoDao;
	
	public SupermercadoBo() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		supermercadoDao = DaoFactory.getSupermercadoDao();
	}
	
	public void cadastrar(SupermercadoTo supermercado) throws SQLException {
		supermercadoDao.cadastrar(supermercado);
	}

	
	public List<SupermercadoTo> listar() throws SQLException {
		return supermercadoDao.listar();
	}

	
	public void atualizar(SupermercadoTo supermercado) throws SQLException {
		supermercadoDao.atualizar(supermercado);
	}

	
	public void remover(int codigo) throws SQLException {
		supermercadoDao.remover(codigo);
	}
	

}
