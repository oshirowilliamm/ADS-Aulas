package Biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Biblioteca livro = new Biblioteca();
		
		livro.setLivro("Harry Potter");
		livro.setAutor("JK Rowling");
		livro.setQuantidade(70);
		livro.setValor(100);
		
		
		sc.close();
	}

}
