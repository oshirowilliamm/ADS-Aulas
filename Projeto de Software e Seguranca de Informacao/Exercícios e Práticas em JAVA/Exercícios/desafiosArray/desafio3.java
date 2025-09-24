package desafiosArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		
		//Lista de Pares
		List<Integer> pares = new ArrayList<>();
		
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				pares.add(numero);
			}
		}
		
		System.out.println("Lista de números: " + numeros);
		System.out.println("Números pares: " + pares);
		
		sc.close();
	}
	
}
