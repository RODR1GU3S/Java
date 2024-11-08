package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_Exercício_Troco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario, dinheiroRecebido, troco, falta; 
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
				
		troco = dinheiroRecebido - ( precoUnitario * quantidade);
		System.out.printf("TROCO = %.2f\n", troco);
		
		System.out.println();
		
		falta = (-( precoUnitario * quantidade) + dinheiroRecebido);
		
		
		// estrutura condicional
		if (dinheiroRecebido >= (precoUnitario * quantidade)) {
			System.out.printf("Estrutura Condicional >> TROCO = %.2f\n", troco);
		} else {
			System.out.printf("Estrutura Condicional >> Falta o pagamento no valor de: %.2f\n", falta);
		}

		sc.close();
	}

}
