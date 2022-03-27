package br.com.fiap.tds.dao;

import java.util.List;

import br.com.fiap.tds.to.RepresentanteEaTo;

public interface RepresentanteEaDao {

	void cadastrar(RepresentanteEaTo repEa);
	
	List<RepresentanteEaTo> listar();
	
	void atualizar(RepresentanteEaTo repEa);
	
	void remover(int codigo);
}
