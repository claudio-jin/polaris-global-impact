package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.ProdutoBo;

public class ProdutoRemover {

	public static void main(String[] args) {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
		
		try {
			ProdutoBo bo = new ProdutoBo();
			bo.remover(cod);
			
			System.out.println("Código removido");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
