package br.com.fiap.tds.view;

import java.util.List;

import br.com.fiap.tds.bo.ProdutoBo;
import br.com.fiap.tds.to.ProdutoTo;

public class ProdutoListar {

	public static void main(String[] args) {
		
		try {
			ProdutoBo bo = new ProdutoBo();
			List<ProdutoTo> lista = bo.listar();
			
			for(ProdutoTo to : lista) {
				System.out.println(to);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
