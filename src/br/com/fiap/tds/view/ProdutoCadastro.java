package br.com.fiap.tds.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bo.ProdutoBo;
import br.com.fiap.tds.to.ProdutoTo;

public class ProdutoCadastro {

	public static void main(String[] args) {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
		String nome = JOptionPane.showInputDialog("Digite o nome do produto");
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produto"));
		
		String dataf = JOptionPane.showInputDialog("Digite a data de fabricação");
		String datav = JOptionPane.showInputDialog("Digite a data de validade");
		
		LocalDate dataFab = LocalDate.parse(dataf, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate dataVal= LocalDate.parse(datav, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		ProdutoTo produto = new ProdutoTo(codigo, nome, qtd, dataFab, dataVal);
		try {
			ProdutoBo bo = new ProdutoBo();
			bo.cadastrar(produto);
			
			System.out.println("Produto cadastrado com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
