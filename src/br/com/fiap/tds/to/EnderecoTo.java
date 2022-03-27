package br.com.fiap.tds.to;

public class EnderecoTo {

	private String logradouro;
	private int numero;
	private int cep;
	private String siglaEstado;
	private String bairro;
	private String complemento;
	private String nomeCidade;
	
	public EnderecoTo() {}
	
	public EnderecoTo(int cep) {
		this.cep = cep;
	}
	
	public EnderecoTo(String logradouro, int numero, int cep, String siglaEstado, String bairro, String complemento,
			String nomeCidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.siglaEstado = siglaEstado;
		this.bairro = bairro;
		this.complemento = complemento;
		this.nomeCidade = nomeCidade;
	}
	
	public String toString() {
		return "Nome do Logradouro: " + logradouro + "\nNúmero do Logradouro: " + numero + "\nCep: " + cep + "\nEstado: " + siglaEstado + " - " + nomeCidade
				+ "\nBairro: " + bairro + "\nComplemento: " + complemento + "\n\n";
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	
}
