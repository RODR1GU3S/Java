package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_Exercício_Terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, valor, area, preco;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		System.out.println("Area do terreno = " + area);
		
		preco = area * valor;
		System.out.println("Preco do terreno = " + preco);
		

		sc.close();
	}
}
