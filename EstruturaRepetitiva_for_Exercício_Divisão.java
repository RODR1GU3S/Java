package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Divisão {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numeroVezes;
		double numerador, denominador, divisao;
		
		System.out.print("Quantos casos voce vai digitar? ");
		numeroVezes = sc.nextInt();
		
		
		for (int i = 1; i <= numeroVezes; i ++) {
			
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextInt();
			
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				divisao = numerador / denominador;
				System.out.printf("DIVISAO = %.2f\n", divisao);
			}
			
			
			
		}
		
		sc.close();
	}

}
