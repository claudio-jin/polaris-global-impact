package br.com.fiap.tds.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.ProdutosDao;
import br.com.fiap.tds.factory.DaoFactory;
import br.com.fiap.tds.to.ProdutoTo;

public class ProdutoBo {

	private ProdutosDao produtoDao;
	
	public ProdutoBo() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		produtoDao = DaoFactory.getProdutoDao();
	}
	
	public void cadastrar(ProdutoTo produto) throws SQLException {
		produtoDao.cadastrar(produto);
	}
	
	public List<ProdutoTo> listar () throws SQLException {
		return produtoDao.listar();
	}
	
	public void atualizar(ProdutoTo produto) throws SQLException {
		produtoDao.atualizar(produto);
	}
	
	public void remover(int codigo) throws SQLException {
		produtoDao.remover(codigo);
	}
}
