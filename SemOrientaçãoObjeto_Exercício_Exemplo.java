package Java;

import java.util.Locale;
import java.util.Scanner;

public class SemOrientaçãoObjeto_Exercício_Exemplo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double aX, bX, cX, aY, bY, cY, p;
		
		System.out.println("Enter the measures of triangle X: ");
		aX = scanner.nextDouble();
		bX = scanner.nextDouble();
		cX = scanner.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		aY = scanner.nextDouble();
		bY = scanner.nextDouble();
		cY = scanner.nextDouble();
		
		p = (aX + bX + cX )/2;
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
		
		p = (aY + bY + cY) /2;
		double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		scanner.close();
	}
}
