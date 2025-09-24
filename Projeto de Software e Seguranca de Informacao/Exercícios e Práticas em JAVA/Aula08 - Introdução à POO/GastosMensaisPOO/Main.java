package GastosMensaisPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Mes jan, fev;
		jan = new Mes();
		fev = new Mes();
		
		//Atribuindo valores
		System.out.println("Digite as contas de Janeiro");
		System.out.println("Alimentação: ");
		jan.alimentacao = sc.nextDouble();
		System.out.println("Luz: ");
		jan.luz = sc.nextDouble();
		System.out.println("Energia: ");
		jan.energia = sc.nextDouble();
		
		System.out.println("Digite as contas de Fevereiro");
		System.out.println("Alimentação: ");
		fev.alimentacao = sc.nextDouble();
		System.out.println("Luz: ");
		fev.luz = sc.nextDouble();
		System.out.println("Energia: ");
		fev.energia = sc.nextDouble();
		
		System.out.println("O valor total das contas de Janeiro é: " + jan.somaTotal());
		System.out.println("O valor total das contas de Fevereiro é: " + fev.somaTotal());
		
		//Calculos
		double contaJan = jan.somaTotal();
		double contaFev = fev.somaTotal();
		
		if (contaJan > contaFev) {
			System.out.println("A conta de Janeiro é maior que a de Fevereiro");
		} else if (contaFev > contaJan) {
			System.out.println("A conta de Fevereiro é maior que a de Janeiro");
		} else {
				System.out.println("As contas possuem o mesmo valor");
		}
	}

}
