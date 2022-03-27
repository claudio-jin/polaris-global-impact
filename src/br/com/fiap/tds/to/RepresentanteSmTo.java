package br.com.fiap.tds.to;

public class RepresentanteSmTo {

	private int codigo;
	private SupermercadoTo supermercado;
	private String nome;
	private int telefone;
	private String email;
	
	public RepresentanteSmTo () {} 
	
	public RepresentanteSmTo (int codigo, String nome, int telefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public RepresentanteSmTo(int codigo, SupermercadoTo supermercado, String nome, int telefone, String email) {
		super();
		this.codigo = codigo;
		this.supermercado = supermercado;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String toString() {
		return "Código do representante: " + codigo + "\nCódigo do supermercado: " + supermercado.getCodSupermercado() + 
				"\nNome do representante: " + nome + "\nTelefone do Representante" + telefone + 
				"\nEmail do representante: " + email + "\n\n";
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public SupermercadoTo getSupermercado() {
		return supermercado;
	}
	public void setSupermercado(SupermercadoTo supermercado) {
		this.supermercado = supermercado;
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
