package pacotePrincipal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Leonardo Cristiano Kuster";
		p1.idade = 26;
		p1.altura = 1.80;
		p1.peso = 90;
		
		System.out.printf("%s\nAno de nascimento %d\n\n", p1.imprimirDados(),p1.anoNascimento());
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Ana Carvalo";
		p2.idade = 30;
		p2.altura = 1.65;
		p2.peso = 69;
		
		System.out.printf("%s\nAno de nascimento %d\n\n", p2.imprimirDados(), p2.anoNascimento());

	}

}
