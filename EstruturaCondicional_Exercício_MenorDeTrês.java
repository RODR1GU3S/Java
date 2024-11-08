package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_MenorDeTrês {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int primeiro, segundo ,terceiro;
		
		System.out.print("Primeiro valor: ");
		primeiro = sc.nextInt();
		System.out.print("Segundo valor: ");
		segundo = sc.nextInt();
		System.out.print("Terceiro valor: ");
		terceiro = sc.nextInt();
		
		if ( primeiro == segundo || primeiro == terceiro || segundo == terceiro) {
			System.out.print("Existem números iguais");
		}
		else if (primeiro < segundo && primeiro < terceiro) {
			System.out.print("MENOR = Primeiro: " + primeiro);
		}
		else if (segundo < terceiro) {
			System.out.print("MENOR = Segundo: " + segundo);
		}
		else {
			System.out.print("MENOR = Terceiro: " + terceiro);
		}
		
		sc.close();
	}
}
