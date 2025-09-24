package estoqueDeRoupas;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Roupa roupa = new Roupa();
		
		//Registrando roupa
		System.out.println("Cadastro de Roupa");
        System.out.print("Marca: ");
        roupa.marca = sc.nextLine();

        System.out.print("Tipo: ");
        roupa.tipo = sc.nextLine();

        System.out.print("Tamanho: ");
        roupa.tamanho = sc.nextLine();

        System.out.print("Quantidade: ");
        roupa.quantidade = sc.nextInt();

        System.out.print("Valor: ");
        roupa.valor = sc.nextDouble();
        
        //Adicionando roupa
        System.out.print("Quantidade para adicionar: ");
        int qtdAdd = sc.nextInt();
        roupa.adicionarEstoque(qtdAdd);
        
        //Remover roupa
        System.out.print("Quantidade para remover: ");
        int qtdRemover = sc.nextInt();
        roupa.removerEstoque(qtdRemover);
        
        //Exibir informações
        roupa.exibirInformacoes();
		
		sc.close();
	}
}