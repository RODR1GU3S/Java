package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = 0; 
		int quantidade = 0;
		double valor;
		
		System.out.print("Código do produto comprado: ");
		codigo = sc.nextInt();
		
		if (codigo > 5) {
			System.out.print("Produto não cadastrado");
		} else if( codigo == 1) {
			System.out.print("Quantidade comprada: ");
			quantidade = sc.nextInt();
			valor = 5.00 * quantidade;
			System.out.printf("Valor a pagar: %.2f\n", valor);
		} else if( codigo == 2) {
			System.out.print("Quantidade comprada: ");
			quantidade = sc.nextInt();
			valor = 3.50 * quantidade;
			System.out.printf("Valor a pagar: %.2f\n", valor);
		} else if( codigo == 3) {
			System.out.print("Quantidade comprada: ");
			quantidade = sc.nextInt();
			valor = 4.80 * quantidade;
			System.out.printf("Valor a pagar: %.2f\n", valor);
		} else if( codigo == 4) {
			System.out.print("Quantidade comprada: ");
			quantidade = sc.nextInt();
			valor = 8.90 * quantidade;
			System.out.printf("Valor a pagar: %.2f\n", valor);
		} else if( codigo == 5) {
			System.out.print("Quantidade comprada: ");
			quantidade = sc.nextInt();
			valor = 7.32 * quantidade;
			System.out.printf("Valor a pagar: %.2f\n", valor);
		}
		
		sc.close();
	}

}
