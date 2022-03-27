package br.com.fiap.tds.view;

import java.util.List;

import br.com.fiap.tds.bo.RepresentanteSmBo;
import br.com.fiap.tds.to.RepresentanteSmTo;

public class RepresentanteSmListar {

	public static void main(String[] args) {
		try {
			RepresentanteSmBo bo = new RepresentanteSmBo();
			List<RepresentanteSmTo> lista = bo.listar();
			
			for(RepresentanteSmTo to : lista) {
				System.out.println(to);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
