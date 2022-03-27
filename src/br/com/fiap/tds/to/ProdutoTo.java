package br.com.fiap.tds.to;

import java.time.LocalDate;

public class ProdutoTo {
	
	private int codigo;
	private String nome;
	private int quantidade;
	private LocalDate dtFab;
	private LocalDate dtVenc;
	
	public ProdutoTo() {}
	
	public ProdutoTo(int codigo, String nome, int quantidade, LocalDate dtFab, LocalDate dtVenc) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.dtFab = dtFab;
		this.dtVenc = dtVenc;
	}
	
	public String toString() {
		return "Código do produto: " + codigo + "\nNome do produto: " + nome + "\nQuantidade: " + quantidade
				+ "\nData de fabricação: " + dtFab + "\nData de validade: " + dtVenc + "\n\n";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDtFab() {
		return dtFab;
	}
	public void setDtFab(LocalDate dtFab) {
		this.dtFab = dtFab;
	}
	public LocalDate getDtVenc() {
		return dtVenc;
	}
	public void setDtVenc(LocalDate dtVenc) {
		this.dtVenc = dtVenc;
	}
	
	

}
