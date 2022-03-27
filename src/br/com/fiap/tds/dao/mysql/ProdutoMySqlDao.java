package br.com.fiap.tds.dao.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.dao.ProdutosDao;
import br.com.fiap.tds.to.ProdutoTo;

public class ProdutoMySqlDao implements ProdutosDao{

	public Connection conexao;
	
	public ProdutoMySqlDao(Connection conexao) throws SQLException {
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(ProdutoTo produto) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProdutoTo> listar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(ProdutoTo produto) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
