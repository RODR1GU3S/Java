package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_Exercício_Círculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = 3.14159;
		double area, raioCirculo;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raioCirculo = sc.nextDouble();
		
		area = raio * (raioCirculo * raioCirculo);
		System.out.printf("AREA = %.3f\n", area);

		sc.close();
	}
}
