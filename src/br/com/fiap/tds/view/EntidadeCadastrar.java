package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.EntidadeBo;
import br.com.fiap.tds.to.EnderecoTo;
import br.com.fiap.tds.to.EntidadesTo;

public class EntidadeCadastrar {

	public static void main(String[] args) {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo da institui��o"));
		int cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep da institui��o"));
		
		String nome = JOptionPane.showInputDialog("Digite o nome da institui��o");
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone"));
		String email = JOptionPane.showInputDialog("Digite o email da institui��o");
		
		EnderecoTo end = new EnderecoTo(cep);

		EntidadesTo ent = new EntidadesTo(cod, end, nome, telefone, email);
		
		try {
			EntidadeBo bo = new EntidadeBo();
			bo.cadastrar(ent);
			
			System.out.println("Entidade cadastrada");
		}  catch(Exception e) {
			e.printStackTrace();
		}


	}
}
