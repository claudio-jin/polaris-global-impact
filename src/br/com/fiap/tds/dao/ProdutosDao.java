package br.com.fiap.tds.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.to.ProdutoTo;

public interface ProdutosDao {
	void cadastrar(ProdutoTo produto) throws SQLException ;
	
	List<ProdutoTo> listar() throws SQLException ;
	
	void atualizar(ProdutoTo produto) throws SQLException ;
	
	void remover(int codigo) throws SQLException ;
}
