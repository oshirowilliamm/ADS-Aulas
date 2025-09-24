package DesafioMediaPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		//Atribuindo valores
		System.out.println("Digite a primeira nota do aluno: ");
		notas.n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		notas.n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		notas.n3 = sc.nextDouble();
		
		double media = notas.Media();
		String situacao = notas.Situacao(media);
		
		System.out.println("A média desse aluno é de: " + media + " e ele está " + situacao + ".");
		
	}

}