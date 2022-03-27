package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.RepresentanteSmBo;
import br.com.fiap.tds.to.RepresentanteSmTo;
import br.com.fiap.tds.to.SupermercadoTo;

public class RepresentanteSmCadastro {

	public static void main(String[] args) {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do representante"));
		int codSup = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do supermercado"));
		String nome = JOptionPane.showInputDialog("Digite o nome do representante");
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone"));
		String email = JOptionPane.showInputDialog("Digite o email");
		
		SupermercadoTo sm = new SupermercadoTo(codSup);
		
		RepresentanteSmTo rep = new RepresentanteSmTo(cod, sm, nome, telefone, email);
		
		try {
			RepresentanteSmBo bo = new RepresentanteSmBo();
			bo.cadastrar(rep);
			
			System.out.println("Representante cadastrado com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
