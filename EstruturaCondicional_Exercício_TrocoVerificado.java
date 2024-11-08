package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_TrocoVerificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoUnitario, valorRecebido, valorPagar, valorTroco, valorFaltante;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		valorRecebido = sc.nextDouble();
		
		valorPagar = precoUnitario * quantidade;
		valorFaltante = valorRecebido - valorPagar;
		valorTroco = (- valorPagar + valorRecebido);
		if (valorPagar > valorRecebido ) {
			System.out.printf("Dinheiro Insuficiente. Falta R$ %.2f Reais \n", - valorFaltante);
		}
		else {
			System.out.printf("TROCO = %.2f\n ", valorTroco);
		}

		sc.close();
	}
}
