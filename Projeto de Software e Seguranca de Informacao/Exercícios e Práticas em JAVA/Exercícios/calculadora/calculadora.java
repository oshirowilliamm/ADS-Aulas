package calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numerador = 0;
		int denominador = 0;
		boolean podeColocar = false;
		
		while (!podeColocar) {
			try {
				System.out.println("Digite o numerador: ");
				numerador = sc.nextInt();
				
				System.out.println("Digite o denominador: ");
				denominador = sc.nextInt();
				
				System.out.println("Resultado: " + (numerador / denominador));
				podeColocar = true;
			} catch (InputMismatchException e) {
				System.out.println("Por favor digite apenas números inteiros: ");
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Divisão por zero não é permitida, por favor digite outro número");
			}
		}
		
	}
}
