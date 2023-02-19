package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Luna", "Branca", 1);
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}

}

class Livro {
	private String nome;
	private String npag;
}