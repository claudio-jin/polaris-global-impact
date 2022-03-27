package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.EnderecoBo;

public class EnderecoRemover {

	public static void main(String[] args) {
		int cep = Integer.parseInt(JOptionPane.showInputDialog("digite o CEP que deseja remover"));
		try {
			EnderecoBo bo = new EnderecoBo();
			bo.remover(cep);
			
			System.out.println("Endereço removido!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
