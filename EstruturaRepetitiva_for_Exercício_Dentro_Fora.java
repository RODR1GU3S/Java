package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Dentro_Fora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N, X, contDentroX, contForaX;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		contDentroX = 0;
		contForaX = 0;
		
		for (int i = 0; i < N; i++) {
			
			System.out.print("Digite um numero: ");
			X = sc.nextInt();
			
			if (X >= 10 && X <= 20) {
				contDentroX = contDentroX + 1;
			} else {
				contForaX = contForaX + 1;
			}
		}
		System.out.println(contDentroX + " DENTRO");
		System.out.println(contForaX + " FORA");

		sc.close();
	}
}
