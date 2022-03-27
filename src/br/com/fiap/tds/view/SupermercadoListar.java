package br.com.fiap.tds.view;

import java.util.List;

import br.com.fiap.tds.bo.SupermercadoBo;
import br.com.fiap.tds.to.SupermercadoTo;

public class SupermercadoListar {

	public static void main(String[] args) {
		try {
			SupermercadoBo bo = new SupermercadoBo();
			List<SupermercadoTo> lista = bo.listar();
			
			for(SupermercadoTo to : lista) {
				System.out.println(to);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
