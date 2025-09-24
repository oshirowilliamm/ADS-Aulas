package desafios;

import java.util.Scanner;

public class desafio02 {
	
	public static void main(String[] args) {
		
		//Titulo
		System.out.println("Calculando Juros Compostos:");
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
		double potencia = Math.pow((1 + i), t);
		double M = C * potencia;
		
		//Resultado
		System.out.println("O montante final é igual a " + M);
		
		sc.close();
	}

}
