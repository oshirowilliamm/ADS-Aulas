package variaveis;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;

		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Seu nome é: " + nome + " e você tem " + idade + " anos de idade");
		 
		
		sc.close();
	}

}
