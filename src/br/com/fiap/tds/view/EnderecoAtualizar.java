package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.EnderecoBo;
import br.com.fiap.tds.to.EnderecoTo;

public class EnderecoAtualizar {

	public static void main(String[] args) {
		int cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep: "));
		
		String logradouro = JOptionPane.showInputDialog("Digite o nome do logradouro");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
		String siglaEstado = JOptionPane.showInputDialog("Digite a sigla do estado");
		String bairro = JOptionPane.showInputDialog("Digite o nome do bairro");
		String complemento = JOptionPane.showInputDialog("Digite o complemento");
		String cidade = JOptionPane.showInputDialog("Digite o nome da cidade");
		
		EnderecoTo endereco = new EnderecoTo(logradouro, numero, cep, siglaEstado, bairro, complemento, cidade);
		
		try {
			EnderecoBo bo = new EnderecoBo();
			bo.atualizar(endereco);
			
			System.out.println("Endere�o atualizado!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
