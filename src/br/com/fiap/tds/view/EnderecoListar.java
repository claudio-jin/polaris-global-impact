package br.com.fiap.tds.view;

import java.util.List;

import br.com.fiap.tds.bo.EnderecoBo;
import br.com.fiap.tds.to.EnderecoTo;

public class EnderecoListar {

	public static void main(String[] args) {
		
		try {
			EnderecoBo bo = new EnderecoBo();
			List<EnderecoTo> lista = bo.listar();
			
			for(EnderecoTo to : lista) {
				System.out.println(to);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
