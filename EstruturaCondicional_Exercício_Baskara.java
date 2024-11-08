package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Baskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	// A fórmula de Bhaskara é uma técnica usada para resolver equações quadráticas da forma:
	//  ax elevado ao quadrado + bx + c = 0, onde	a, b e	c são coeficientes, e a ≠ 0.

		// Coeficientes
        double a, b, c,x1, x2, delta; // D, 

        // Entrada dos coeficientes
        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();

        // Prof. Nélio Alves
	    delta = (b * b) - (4 * a * c);

	    if (delta < 0) {
	    	System.out.println("Esta equação não possui raizes reais");
	    }
	    else {
	        x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
	        x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

	        System.out.printf("X1 = %.4f%n", x1);
	        System.out.printf("X2 = %.4f%n", x2);
	    }

/*      // ChatGPT
        // Cálculo do discriminante
        D = Math.pow(b, 2) - (4 * a * c);

        // Verificação da natureza das raízes
        if (D > 0) {
            // Duas raízes reais e distintas
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("As raízes são: \nX1 = %.4f \nX2 = %.4f%n", x1, x2);
        } else if (D == 0) {
            // Uma raiz real
            x1 = -b / (2.0 * a);
            System.out.printf("A raiz é: \nx = %.4f%n", x1);
        } else {
            // Raízes complexas
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-D) / (2.0 * a);
            System.out.print("Esta equação não possui raizes reais");
            System.out.printf("As raízes são complexas: \nX1 = %.4f + %.4fi \nX2 = %.4f - %.4fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
*/	
		sc.close();
	}
}
