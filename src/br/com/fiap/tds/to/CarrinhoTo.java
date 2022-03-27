package br.com.fiap.tds.to;

public class CarrinhoTo {

	private int codCarrinho;
	private EntidadesTo entidades;
	private String retirada;
	
	public CarrinhoTo () {}
	
	public CarrinhoTo(int codCarrinho, EntidadesTo entidades, String retirada) {
		super();
		this.codCarrinho = codCarrinho;
		this.entidades = entidades;
		this.retirada = retirada;
	}
	
	public int getCodCarrinho() {
		return codCarrinho;
	}
	public void setCodCarrinho(int codCarrinho) {
		this.codCarrinho = codCarrinho;
	}
	public EntidadesTo getEntidades() {
		return entidades;
	}
	public void setEntidades(EntidadesTo entidades) {
		this.entidades = entidades;
	}
	public String getRetirada() {
		return retirada;
	}
	public void setRetirada(String retirada) {
		this.retirada = retirada;
	}
	
	
}
