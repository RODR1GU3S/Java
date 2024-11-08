package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_Pares_Consecutivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// Código do ChatGPT:

		while (true) {
			System.out.print("Digite um numero inteiro: ");
			int valorX = sc.nextInt();

			if (valorX == 0) {
				break;
			}

			int somaX = 0;
			int contagemSoma = 0;

			if (valorX % 2 != 0) { // Se ímpar, incrementa para torná-lo par
				valorX++;
			}

			while (contagemSoma < 5) { // Calcula a soma dos 5 pares consecutivos
				somaX += valorX;
				contagemSoma++;
				valorX += 2; // Avança para o próximo número par
			}
			System.out.println("SOMA = " + somaX);
		}
		sc.close();
	}
}
/* >> Meu código

	while (true) { // >> O while (true) executa indefinidamente até que seja interrompido, 
	           		//     nesse código a condição if (valorX == 0) { 
	           		//                                  break;
	           		//                              }
	
	System.out.print("Digite um numero inteiro: ");
	int valorX = sc.nextInt();

	if (valorX == 0) {
		break;
	}

	int somaX = 0, contagemSoma = 0;

	while (contagemSoma < 5) {

		if (valorX % 2 == 0) {
			somaX = somaX + valorX;
			contagemSoma++;
			valorX++;
		} else if (valorX % 2 != 0) {
			valorX++;
		}
	}
	System.out.println("SOMA = " + somaX);
}
*/

/* >> Código Prof. Nélio Alves

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, soma;

		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();

		while (x != 0) {
			if (x % 2 != 0) {
				x++;
			}

			soma = 5 * x + 20;
			System.out.printf("SOMA = %d\n", soma);

			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
		}
		sc.close();
*/
