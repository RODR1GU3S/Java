package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiroSemestre, segundoSemestre, notaFinal;
		
		System.out.print("Digite a primeira nota: ");
		primeiroSemestre = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		segundoSemestre = sc.nextDouble();
		
		notaFinal = primeiroSemestre + segundoSemestre;
		
		if(notaFinal < 60) {
			System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
			System.out.print("REPROVADO");
		}
		else {
			System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
		}
		
		sc.close();
	}
}
