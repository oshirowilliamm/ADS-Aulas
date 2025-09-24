package desafios;

import java.util.Scanner;

public class desafio04 {
	
	public static void main(String[] args) {
		
		//Titulo
		System.out.println("Calculadora de Juros Simples:");
		System.out.println("");
		
		//Pegando infos
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a capital inicial:");
		double C = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros:");
		double i = sc.nextDouble();
		
		System.out.println("Digite o número de meses:");
		int t = sc.nextInt();
		
		//Programa
		double J = C * i * t;
		double M = C + J;
		
		//Resultado
		System.out.println("O valor dos juros é de " + J + " e o valor do montante é " + M);
		
		sc.close();
	}

}
