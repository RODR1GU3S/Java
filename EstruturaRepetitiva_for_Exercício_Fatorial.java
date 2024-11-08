package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = 0;
		long fatorial = 1;
		
		System.out.print("Digite o valor de N: ");
		N = sc.nextInt();
		
		if ( N > 15 && N < 0) {
			System.out.println("Informe um valor igual ou menor que 15");
		}
		else {
			for(int i = 1; i <= N; i ++) {
				fatorial *= i;
			}
			System.out.println("FATORIAL = "+ fatorial);
		}
		sc.close();
	}
}
