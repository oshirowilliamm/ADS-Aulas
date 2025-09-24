package desafios;

import java.util.Scanner;

public class desafio03 {
	
	public static void main(String[] args) {
		
		//Titulo
		System.out.println("Média de Aluno:");
		System.out.println("");
		
		//Pegando infos
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 notas:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		//Programa
		double media = (n1 + n2 + n3) / 3;
		
		//Resultado
		System.out.println("A média final do aluno é " + media);
		
		sc.close();
	}

}
