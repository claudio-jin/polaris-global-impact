package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.ProdutoBo;

public class ProdutoRemover {

	public static void main(String[] args) {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto"));
		
		try {
			ProdutoBo bo = new ProdutoBo();
			bo.remover(cod);
			
			System.out.println("C�digo removido");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
