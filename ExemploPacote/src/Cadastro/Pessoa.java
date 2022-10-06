package Cadastro;

public class Pessoa {

	private String nome;
	private String cpf;
	private String endereco;
	
	
	public Pessoa(String nome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}


	private String getNome() {
		return nome;
	}


	private void setNome(String nome) {
		this.nome = nome;
	}


	private String getCpf() {
		return cpf;
	}


	private void setCpf(String cpf) {
		this.cpf = cpf;
	}


	private String getEndereco() {
		return endereco;
	}


	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void status() {
		System.out.println("Cadastro Pessoal Fisica");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Enderenço: " + this.endereco);
	}
	
}

