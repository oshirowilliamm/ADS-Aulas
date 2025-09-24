package desafios;

import java.util.Scanner;

public class desafio05 {
	
	public static void main(String[] args) {
		
		//Titulo
		System.out.println("Área e Perímetro de um Círculo:");
		System.out.println("");
		
		//Pegando infos
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio do círculo:");
		int r = sc.nextInt();
		
		//Programa]
		double potencia = Math.pow(r, 2);
		double A = Math.PI * potencia;
		double P = 2 * Math.PI * r;
		
		//Resultado
		System.out.println("A área desse círculo é: " + A);
		System.out.println("O perímetro desse círculo é: " + P);
		
		sc.close();
	}

}
