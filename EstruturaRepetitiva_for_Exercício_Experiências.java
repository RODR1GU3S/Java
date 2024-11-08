package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Experiências {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroCasos, quantidadeCobaias, totalCobaias = 0, quantidadeR = 0, quantidadeS = 0, quantidadeC = 0;
		double percentualCoelhos = 0.0, percentualRatos = 0.0, percentualSapos = 0.0;
		char tipoCobaia;

		System.out.print("Quantos casos de teste serao digitados? ");
		numeroCasos = sc.nextInt();

		for (int i = 1; i <= numeroCasos; i++) {

			System.out.print("Quantidade de cobaias: ");
			quantidadeCobaias = sc.nextInt();

			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);

			if (tipoCobaia == 'R') {
				quantidadeR = quantidadeR + quantidadeCobaias;
			}
			else if (tipoCobaia == 'S') {
				quantidadeS = quantidadeS + quantidadeCobaias;
			}
			else if (tipoCobaia == 'C') {
				quantidadeC = quantidadeC + quantidadeCobaias;
			}
			else {
				System.out.println("Cobaia não cadastrada ");
			}
		}
		System.out.println("\nRELATORIO FINAL:");

		totalCobaias = quantidadeR + quantidadeS + quantidadeC;
		System.out.println("Total: " + totalCobaias + " cobaias");

		System.out.println("Total de coelhos: " + quantidadeC);
		System.out.println("Total de ratos: " + quantidadeR);
		System.out.println("Total de sapos: " + quantidadeS);

		// Convertendo para double para obter o resultado em porcentagem
		percentualCoelhos = (double) quantidadeC / totalCobaias * 100;
		percentualRatos = (double) quantidadeR / totalCobaias * 100;
		percentualSapos = (double) quantidadeS / totalCobaias * 100;

		System.out.printf("Percentual de coelhos: %.2f%%\n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f%%\n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f%%\n", percentualSapos);

		sc.close();
	}
}
