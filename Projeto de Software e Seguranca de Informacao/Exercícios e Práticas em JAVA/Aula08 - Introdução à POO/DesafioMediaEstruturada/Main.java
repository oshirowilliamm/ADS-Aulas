package DesafioMediaEstruturada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3;
		
		//Atribuindo valores
		System.out.println("Digite a primeira nota do aluno: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		n3 = sc.nextDouble();
		
		//Calculando média
		double media = (n1 + n2 + n3) / 3;
		String situacao;
		
		//Calculando aprovação
		if (media >= 7) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		
		System.out.println("A média desse aluno é de: " + media + " e ele está " + situacao + ".");
	}

}
