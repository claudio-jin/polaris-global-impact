package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.SupermercadoBo;

public class SupermercadoRemover {

	public static void main(String[] args) {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo que deseja remover: "));
		
		try {
			SupermercadoBo bo = new SupermercadoBo();
			bo.remover(cod);
			
			System.out.println("Código removido");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
