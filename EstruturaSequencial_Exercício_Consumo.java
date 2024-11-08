package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_Exercício_Consumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivelGasto, consumoMedio;
		
		System.out.print("Distancia percorrida: ");
		distancia = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		consumoMedio = distancia / combustivelGasto;
		System.out.printf("Consumo medio = %.3f", consumoMedio);
		
		sc.close();
	}
}
