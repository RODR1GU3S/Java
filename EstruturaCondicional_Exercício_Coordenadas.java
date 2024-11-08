package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Coordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor de X: ");
		double X = sc.nextDouble();
		System.out.print("Valor de Y: ");
		double Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.print("Origem");
		} else if (X > 0 && Y > 0) {
			System.out.print("Q1");
		} else if (X < 0 && Y > 0) {
			System.out.print("Q2");
		} else if (X < 0 && Y < 0) {
			System.out.print("Q3");
		} else if (X > 0 && Y < 0) {
			System.out.print("Q4");
		} else if (X > 0 && Y == 0){
			System.out.print("Eixo X");
		} else if (Y > 0 && X == 0){
			System.out.print("Eixo Y");
		}

		sc.close();
	}
}
