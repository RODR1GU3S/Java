package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Multiplos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num_1, num_2;

		System.out.println("Digite dois numeros inteiros:");
		num_1 = sc.nextInt();
		num_2 = sc.nextByte();
		
		if (num_1 % num_2 == 0 || num_2 % num_1 == 0) {
			System.out.print("São Multiplos");
		}
		else {
			System.out.print("Não São Multiplos");
		}
		sc.close();
	}
}
