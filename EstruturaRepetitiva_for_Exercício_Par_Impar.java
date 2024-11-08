package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Par_Impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, X;

		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();

	// Código Ajustado >> Prof. Nélio Alves

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			X = sc.nextInt();

			if (X == 0) {
				System.out.println("NULO");
			} else {
				if (X % 2 != 0) {

					System.out.print("IMPAR ");
				} else {
					System.out.print("PAR ");
				}

				if (X < 0) {
					System.out.println("NEGATIVO");
				} else {
					System.out.println("POSITIVO");
				}
			}
		}
		sc.close();
	}
}
/* >> Meu Código:
 
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			X = sc.nextInt();
			
			if (X == 0) {
				System.out.println("NULO");
			}
			else if (X % 2 != 0) {
				if (X < 0) {
					System.out.println("IMPAR NEGATIVO");
				} else {
					System.out.println("IMPAR POSITIVO");
				}
			} else if (X % 2 == 0) {
				if (X < 0) {
					System.out.println("PAR NEGATIVO");
				} else {
					System.out.println("PAR POSITIVO");
				}
			}
		}
*/