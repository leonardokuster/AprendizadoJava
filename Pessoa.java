package pacotePrincipal;

public class Pessoa {
	
	int idade;
	double altura, peso;
	String nome;
	
	String imprimirDados() {
		return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nPeso: " +
				Double.toString(peso) + "\nAltura: " + Double.toString(altura);
	}
	
	int anoNascimento() {
		return 2022 - idade;
	}

}
