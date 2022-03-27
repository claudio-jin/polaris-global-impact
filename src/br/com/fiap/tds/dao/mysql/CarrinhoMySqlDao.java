package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.tds.dao.CarrinhoDao;
import br.com.fiap.tds.to.CarrinhoTo;

public class CarrinhoMySqlDao implements CarrinhoDao{

	public Connection conexao;
	
	public CarrinhoMySqlDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(CarrinhoTo carrinho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CarrinhoTo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(CarrinhoTo carrinho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) {
		// TODO Auto-generated method stub
		
	}

}
