package br.com.fiap.tds.dao;

import java.util.List;

import br.com.fiap.tds.to.CarrinhoTo;

public interface CarrinhoDao {

	void cadastrar(CarrinhoTo carrinho);
	
	List<CarrinhoTo> listar();
	
	void atualizar(CarrinhoTo carrinho);
	
	void remover(int codigo);
}
