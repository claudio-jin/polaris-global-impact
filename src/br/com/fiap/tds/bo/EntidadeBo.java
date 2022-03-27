package br.com.fiap.tds.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.EntidadeDao;
import br.com.fiap.tds.factory.DaoFactory;
import br.com.fiap.tds.to.EntidadesTo;

public class EntidadeBo {
	
	private EntidadeDao entidadeDao;
	
	public EntidadeBo() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		entidadeDao = DaoFactory.getEntidadeDao();
	}
	
	public void cadastrar(EntidadesTo entidade) throws SQLException {
		entidadeDao.cadastrar(entidade);
	}
	
	public List<EntidadesTo> listar () throws SQLException {
			return entidadeDao.listar();
	}
	
	public void atualizar(EntidadesTo entidade) throws SQLException {
		entidadeDao.atualizar(entidade);
	}
	
	public void remover(int codigo) throws SQLException {
		entidadeDao.remover(codigo);
	}
}
