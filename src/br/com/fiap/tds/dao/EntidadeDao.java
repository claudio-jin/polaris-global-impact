package br.com.fiap.tds.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.to.EntidadesTo;

public interface EntidadeDao {
	void cadastrar(EntidadesTo entidade)throws SQLException;
	
	List<EntidadesTo> listar()throws SQLException;
	
	void atualizar(EntidadesTo entidade)throws SQLException;
	
	void remover(int codigo)throws SQLException;
}
