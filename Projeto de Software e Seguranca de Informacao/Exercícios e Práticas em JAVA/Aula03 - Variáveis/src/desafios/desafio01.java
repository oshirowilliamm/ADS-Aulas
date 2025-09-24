package desafios;
import java.util.Scanner;

public class desafio01 {
	
	public static void main(String[] args) {
		
		//Titulo
		System.out.println("Conversão de Temperatura:");
		System.out.println("");
		
		//Pegando infos
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Celsius:");
		double C = sc.nextDouble();
		
		//Programa
		double F = (C * 9/5) + 32;
		double K = C + 273.15;
		
		//Resultado
		System.out.println(C + "°C converte para:");
		System.out.println(F + "°F");
		System.out.println(K + "°K");
		
		sc.close();
	}
}
