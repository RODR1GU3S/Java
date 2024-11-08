package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Média_Ponderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroCasos;
		double pesoA, pesoB, pesoC, media;

		System.out.print("Quantos casos voce vai digitar? ");
		numeroCasos = sc.nextInt();

		for (int i = 1; i <= numeroCasos; i++) {
			System.out.println("Digite tres numeros:");
			pesoA = sc.nextDouble();
			pesoB = sc.nextDouble();
			pesoC = sc.nextDouble();
		
			// Verifica se todos os valores são não negativos
			if (pesoA >= 0 && pesoB >= 0 && pesoC >= 0) {
				
				pesoA = pesoA * 2;
				pesoB = pesoB * 3;
				pesoC = pesoC * 5;
				
				media = (pesoA + pesoB + pesoC) / 10;
				System.out.printf("MEDIA = %.1f\n", media);
			} else {
                System.out.println("Valores inválidos! Todos os números devem ser não negativos.");
            }
		}
		sc.close();
	}
}
