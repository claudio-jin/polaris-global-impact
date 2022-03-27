package br.com.fiap.tds.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.factory.DaoFactory;
import br.com.fiap.tds.to.EnderecoTo;

public class EnderecoBo {

	private EnderecoDao enderecoDao;
	
	public EnderecoBo() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		enderecoDao = DaoFactory.getEnderecoDao();
	}
	
	public void cadastrar(EnderecoTo endereco) throws SQLException {
		enderecoDao.cadastrar(endereco);
	}
	
	public List<EnderecoTo> listar () throws SQLException {
		return enderecoDao.listar();
	}
	
	public void atualizar(EnderecoTo endereco) throws SQLException {
		enderecoDao.atualizar(endereco);
	}
	
	public void remover(int cep) throws SQLException {
		enderecoDao.remover(cep);
	}
}
