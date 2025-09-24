package desafiosArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(8);
		numeros.add(7);
		numeros.add(1);
		numeros.add(4);
		
		//Soma
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		
		//Media
		double media = soma / numeros.size();
		
		System.out.println("Lista de números: " + numeros);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        
        sc.close();
	}	
	
}
