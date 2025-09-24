package desafiosArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Alice");
        nomes.add("Carlos");
        nomes.add("André");
        nomes.add("Beatriz");
        nomes.add("Amanda");
        
        //Pegando a letra para filtragem
        System.out.println("Digite a letra para a filtragem: ");
        String letra = sc.nextLine().toUpperCase();
        
        //Lista de nomes filtrados
        List<String> nomesFiltrados = new ArrayList<>();
        
        //Filtrando
        for (String nome: nomes) {
        	if (nome.toUpperCase().startsWith(letra)) {
        		nomesFiltrados.add(nome);
        	}
        }
        
        System.out.println("Nomes encontrados que começam com \"" + letra + "\": " + nomesFiltrados);
        System.out.println("Total de nomes: " + nomesFiltrados.size());
        
        sc.close();
	}

}
