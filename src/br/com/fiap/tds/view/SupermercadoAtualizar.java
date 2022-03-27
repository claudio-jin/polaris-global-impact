package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.SupermercadoBo;
import br.com.fiap.tds.to.EnderecoTo;
import br.com.fiap.tds.to.SupermercadoTo;

public class SupermercadoAtualizar {

	public static void main(String[] args) {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do supermercado"));
		String nome = JOptionPane.showInputDialog("Digite o nome do supermercado");
		
		int cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep do supermercado"));
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone"));
		String email = JOptionPane.showInputDialog("Digite o email do supermercado");
		
		int cnpj = Integer.parseInt(JOptionPane.showInputDialog("Digite o cnpj"));
		
		EnderecoTo end = new EnderecoTo(cep);
		
		SupermercadoTo sm = new SupermercadoTo(cod, nome, end, telefone, cnpj, email);
		
		try {
			SupermercadoBo bo = new SupermercadoBo();
			bo.atualizar(sm);
			
			System.out.println("Supermercado atualizado");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
