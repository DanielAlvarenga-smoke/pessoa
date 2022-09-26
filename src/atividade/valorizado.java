package atividade;

public class valorizado {

	public static void main(String[] args) {
		Pessoa people1 = new Pessoa();
		Pessoa people2 = new Pessoa("Rafael Alvarenga Oliveira", "12345", 19);
		people1.nome = "Daniel Alvarenga Oliveira";
		people1.cpf = "54321";
		people1.idade = 16;
		System.out.println("Nome " + people1.nome + "\nCpf:" + people1.cpf + "\nIdade:" + people1.idade);
		System.out.println("\nNome: " + people2.nome + "\nCpf: " + people2.cpf + "\nIdade " + people2.idade);
		people1.minhasInformacoes();
	}

}
