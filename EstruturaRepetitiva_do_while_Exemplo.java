package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_do_while_Exemplo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();

			double fahrenheit = ((9 * celsius) / 5) + 32;
			System.out.printf("Equivalente a Fahrenheit: %.2f\n", fahrenheit);

			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
