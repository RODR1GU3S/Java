package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_Combutível {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = 0, alcool = 0, gasolina = 0, diesel = 0;

		while (codigo != 4) {

			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();

			if (codigo == 1) {
				alcool ++;
			} else if (codigo == 2) {
				gasolina ++;
			} else if (codigo == 3) {
				diesel++;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
