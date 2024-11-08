package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_Crescente_Decrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// Esse código do-while é mais simples e mais fácil de entender, o que geralmente é uma boa prática de Clean Code.
		
		int X, Y;

		do {
			System.out.println("Digite dois números:");
			X = sc.nextInt();
			Y = sc.nextInt();
			
			if (X < Y) {
				System.out.println("CRESCENTE!");
			}
			else if (Y < X) {
				System.out.println("DECRESCENTE!");
			}

		} while (X != Y);
		
		sc.close();
	}
}
/* Meu código --------------- while ---------------

		System.out.println("Digite dois números:");
		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.println("CRESCENTE!");
			}
			else if (X > Y) {
				System.out.println("DECRESCENTE!");
			}
			System.out.println("Digite outros dois números:");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
*/