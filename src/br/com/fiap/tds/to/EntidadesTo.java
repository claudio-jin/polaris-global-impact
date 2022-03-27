package br.com.fiap.tds.to;

public class EntidadesTo {
	
	private int codigo;
	private EnderecoTo endereco;
	private String nome;
	private int telefone;
	private String email;
	
	public EntidadesTo () {}
	
	public EntidadesTo(int codigo) {
		this.codigo = codigo;
	}
	
	public EntidadesTo(int codigo, String nome, int telefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	
	public EntidadesTo(int codigo, EnderecoTo endereco, String nome, int telefone, String email) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public EnderecoTo getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoTo endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
