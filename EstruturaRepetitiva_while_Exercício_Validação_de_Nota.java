package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_Validação_de_Nota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiraNota = 0.0, segundaNota = 0.0, mediaSemestral;

		if (primeiraNota >= 0 || segundaNota >= 0) {

			System.out.print("Digite a primeira nota: ");
			primeiraNota = sc.nextDouble();
			while (primeiraNota < 0 || primeiraNota > 10) {
				System.out.print("Valor inválido! Tente novamente: ");
				primeiraNota = sc.nextDouble();
			}

			System.out.print("Digite a segunda nota: ");
			segundaNota = sc.nextDouble();
			while (segundaNota < 0 || segundaNota > 10) {
				System.out.print("Valor inválido! Tente novamente: ");
				segundaNota = sc.nextDouble();
			}
			mediaSemestral = ((primeiraNota + segundaNota) / 2);
			System.out.printf("MÉDIA = %.2f\n", mediaSemestral);
		}

		sc.close();
	}
}
