package GastosMensais;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double alimJan, alimFev, luzJan, luzFev, energiaJan, energiaFev;
		
		//Atribuindo os valores às variáveis
		System.out.println("Digite as contas de Janeiro");
		System.out.println("Alimentação: ");
		alimJan = sc.nextDouble();
		System.out.println("Luz: ");
		luzJan = sc.nextDouble();
		System.out.println("Energia: ");
		energiaJan = sc.nextDouble();
		
		System.out.println("Digite as contas de Fevereiro");
		System.out.println("Alimentação: ");
		alimFev = sc.nextDouble();
		System.out.println("Luz: ");
		luzFev = sc.nextDouble();
		System.out.println("Energia: ");
		energiaFev = sc.nextDouble();
		
		//Total das contas
		double contaJan = alimJan + luzJan + energiaJan;
		double contaFev = alimFev + luzFev + energiaFev;
		
		//Calculos
		if (contaJan > contaFev) {
			System.out.println("A conta de Janeiro é maior que a de Fevereiro");
		} else if (contaFev > contaJan) {
			System.out.println("A conta de Fevereiro é maior que a de Janeiro");
		} else {
			System.out.println("As contas possuem o mesmo valor");
		}
	}
}
