package br.com.fiap.tds.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.to.EnderecoTo;

public interface EnderecoDao {

	void cadastrar(EnderecoTo endereco) throws SQLException;
	
	List<EnderecoTo> listar() throws SQLException;
	
	void atualizar(EnderecoTo endereco) throws SQLException;
	
	void remover(int cep) throws SQLException;
}
