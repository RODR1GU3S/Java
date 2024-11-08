package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Dardo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b,c;
		
		System.out.println("Digite as tres distancias:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if( a > b && a > c) {
			System.out.printf("MAIOR DISTANCIA = %.2f\n", a);
		}
		else if (b > c) {
			System.out.printf("MAIOR DISTANCIA = %.2f\n", b);
		}
		else {
			System.out.printf("MAIOR DISTANCIA = %.2f\n", c);
		}
		sc.close();
	}
}
