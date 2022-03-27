package br.com.fiap.tds.to;

public class RepresentanteEaTo {

	private int codigo;
	private EntidadesTo entidades;
	private String nome;
	private int telefone;
	private String email;
	
	public RepresentanteEaTo() {}
	
	public RepresentanteEaTo (int codigo, String nome, int telefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public RepresentanteEaTo(int codigo, EntidadesTo entidades, String nome, int telefone, String email) {
		super();
		this.codigo = codigo;
		this.entidades = entidades;
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
	public EntidadesTo getEntidades() {
		return entidades;
	}
	public void setEntidades(EntidadesTo entidades) {
		this.entidades = entidades;
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
