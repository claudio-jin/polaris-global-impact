package br.com.fiap.tds.to;

public class SupermercadoTo {

	private int codSupermercado;
	private String nome;
	private EnderecoTo endereco;
	private int telefone;
	private int cnpj;
	private String email;
	
	public SupermercadoTo() {}
	
	public SupermercadoTo(int codSupermercado) {
		this.codSupermercado = codSupermercado;
	}
	
	public SupermercadoTo(int codSupermercado, String nome, int telefone, int cnpj, String email) {
		this.codSupermercado = codSupermercado;
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.email = email;
	}
	
	public SupermercadoTo(int codSupermercado, String nome, EnderecoTo endereco, int telefone,
			int cnpj, String email) {
		super();
		this.codSupermercado = codSupermercado;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.email = email;
	}
	
	public String toString() {
		return "Código do supermercado: " + codSupermercado + "\nNome do supermercado: " + nome +  "\nCep do supermercado: " + endereco.getCep() + 
				"\nTelefone do supermercado: " + telefone + "\nCnpj do supermercado: " + cnpj + "\nEmail do supermercado: " + email + "\n\n"; 
	}
	
	public int getCodSupermercado() {
		return codSupermercado;
	}
	public void setCodSupermercado(int codSupermercado) {
		this.codSupermercado = codSupermercado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnderecoTo getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoTo endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
