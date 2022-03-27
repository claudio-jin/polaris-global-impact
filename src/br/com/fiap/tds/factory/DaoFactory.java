package br.com.fiap.tds.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.dao.EntidadeDao;
import br.com.fiap.tds.dao.ProdutosDao;
import br.com.fiap.tds.dao.RepresentanteSmDao;
import br.com.fiap.tds.dao.SupermercadoDao;
import br.com.fiap.tds.dao.oracle.EnderecoOracleDao;
import br.com.fiap.tds.dao.oracle.EntidadeOracleDao;
import br.com.fiap.tds.dao.oracle.ProdutoOracleDao;
import br.com.fiap.tds.dao.oracle.RepresentanteSmOracleDao;
import br.com.fiap.tds.dao.oracle.SupermercadoOracleDao;
import br.com.fiap.tds.singleton.ConnectionManager;

public class DaoFactory {

	public static EnderecoDao getEnderecoDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new EnderecoOracleDao(ConnectionManager.getInstance().getConnection());
	}
	
	public static ProdutosDao getProdutoDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new ProdutoOracleDao(ConnectionManager.getInstance().getConnection());
	}
	
	public static SupermercadoDao getSupermercadoDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new SupermercadoOracleDao(ConnectionManager.getInstance().getConnection());
	}
	
	public static RepresentanteSmDao getRepresentanteSmDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new RepresentanteSmOracleDao(ConnectionManager.getInstance().getConnection());
	}
	
	public static EntidadeDao getEntidadeDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new EntidadeOracleDao(ConnectionManager.getInstance().getConnection());
	}
}
