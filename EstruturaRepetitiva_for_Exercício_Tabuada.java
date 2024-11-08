package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja a tabuada para qual valor? ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N*i));
		}
		
		sc.close();
	}
}
