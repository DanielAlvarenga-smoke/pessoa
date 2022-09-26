package atividade;

public class Pessoa {
	String nome;
	String cpf;
	int idade;

	public Pessoa() {
		nome = "";
		cpf = "";
		idade = 0;
	}
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public void minhasInformacoes() {
		System.out.println("\nnome : " + nome + "\ncpf: " + cpf + "\nIdade: " + idade);
	}
}
