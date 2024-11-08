package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double planoBase = 50.00;
		double minutoValor = 2.00;
		double valorPagar = planoBase;
		int minutoBase = 100;
		int minuto;
		
		System.out.print("Digite a quantidade de minutos: ");
		minuto = sc.nextInt();
		
	// Sugestão do ChatGPT, para eliminar a duplicação da saída:
		
		if (minuto > minutoBase ) {
			valorPagar = planoBase + ((minuto - minutoBase) * minutoValor);
		}
			System.out.printf("Valor a pagar: %.2f\n", valorPagar);

		sc.close();
	}
}
/*  Meu Código:
 
		if (minuto > minutoBase ) {
			valorPagar = planoBase + ((minuto - minutoBase) * minutoValor);
			System.out.printf("Valor a pagar: %.2f\n", valorPagar);
		}
		else {
			System.out.printf("Valor a pagar: %.2f\n", planoBase);
		}
*/ 
