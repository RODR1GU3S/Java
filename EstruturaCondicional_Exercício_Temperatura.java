package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double C, F;
		
		char temperatura;
		/* Como char armazena um único caractere,
		    é eficiente e apropriado para esse tipo de situação,
		     onde se quer distinguir entre duas opções representadas por uma única letra (no caso, 'C' ou 'F').*/
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		
		temperatura = sc.next().charAt(0);
		/* A função sc.next() lê uma palavra (ou seja, uma sequência de caracteres) digitada pelo usuário.
		    O método charAt(0) pega o primeiro caractere dessa sequência de caracteres (índice 0) e armazena na variável temperatura. */

		/* A estrutura condicional if em Java
		    é usada para tomar decisões com base em condições específicas,
		     que são expressões que podem ser avaliadas como verdadeiras (true) ou falsas (false). 
		*/
		if (temperatura == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			F = sc.nextDouble();
			
			C = 5.0 / 9.0 * (F - 32.0);
			System.out.printf("Temperatura equivalente em Celsius: %.2f\n", C);
		}
		else {
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			
			F = C * 9.0 / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", F);
		}

		sc.close();
	}
}
