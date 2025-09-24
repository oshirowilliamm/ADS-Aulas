package desafiosArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> frutas = new ArrayList<>();
		frutas.add("Banana");
		frutas.add("Melância");
		frutas.add("Manga");
		frutas.add("Laranja");
		frutas.add("Mirtilo");
		frutas.add("Uva");
		frutas.add("Coco");
		
		//Filtragem de letra
		System.out.println("Digite a letra para a filtragem: ");
		String letra = sc.nextLine().toUpperCase();
		
		//Lista de frutas filtrados
        List<String> frutasFiltradas = new ArrayList<>();
        
        //Filtrando
        for (String fruta: frutas) {
        	if (!fruta.toUpperCase().contains(letra)) {
        		frutasFiltradas.add(fruta);
        	}
        }
        
        System.out.println("Palavras originais: " + frutas);
        System.out.print("Removendo palavras que contêm \"" + letra + "\": " + frutasFiltradas);
        
        sc.close();
	}
	
}
