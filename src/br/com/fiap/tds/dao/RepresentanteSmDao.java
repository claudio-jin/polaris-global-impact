package br.com.fiap.tds.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.to.RepresentanteSmTo;

public interface RepresentanteSmDao {
	void cadastrar(RepresentanteSmTo repSm) throws SQLException ;
	
	List<RepresentanteSmTo> listar() throws SQLException ;
	
	void atualizar(RepresentanteSmTo repSm) throws SQLException ;
	
	void remover(int codigo) throws SQLException ;
}
