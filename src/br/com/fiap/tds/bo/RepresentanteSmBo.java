package br.com.fiap.tds.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.RepresentanteSmDao;
import br.com.fiap.tds.factory.DaoFactory;
import br.com.fiap.tds.to.RepresentanteSmTo;

public class RepresentanteSmBo {

	private RepresentanteSmDao repDao;
	
 	public RepresentanteSmBo() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
 		repDao = DaoFactory.getRepresentanteSmDao();
 	}
 	
	public void cadastrar(RepresentanteSmTo repSm) throws SQLException {
		repDao.cadastrar(repSm);
	}

	public List<RepresentanteSmTo> listar() throws SQLException {
		return repDao.listar();
	}

	public void atualizar(RepresentanteSmTo repSm) throws SQLException {
		repDao.atualizar(repSm);
	}

	public void remover(int codigo) throws SQLException {
		repDao.remover(codigo);
	}

	
	
	
	
	
}
