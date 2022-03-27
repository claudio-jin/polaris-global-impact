package br.com.fiap.tds.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.to.SupermercadoTo;

public interface SupermercadoDao {
	void cadastrar(SupermercadoTo supermercado) throws SQLException;
	
	List<SupermercadoTo> listar() throws SQLException;
	
	void atualizar(SupermercadoTo supermercado) throws SQLException;
	
	void remover(int codigo) throws SQLException;
}
