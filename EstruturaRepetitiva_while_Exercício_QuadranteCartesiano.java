package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_QuadranteCartesiano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// Código do ChatGPT

		int coordenadaX, coordenadaY;

        do {
            System.out.println("Digite os valores das coordenadas X e Y (0 para encerrar):");
            coordenadaX = sc.nextInt();
            coordenadaY = sc.nextInt();

            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("QUADRANTE Q1");
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("QUADRANTE Q2");
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("QUADRANTE Q3");
            } else if (coordenadaX > 0 && coordenadaY < 0) {
                System.out.println("QUADRANTE Q4");
            }

        } while (coordenadaX != 0 && coordenadaY != 0);

		sc.close();
	}
}
/* >>>> Meu código: ---------- OBSERVAÇÕES ----------

				Análise e Sugestões ChatGPT:
	
	Uso desnecessário de múltiplos loops while dentro de outro while:

	O código usa vários while aninhados com break para interrompê-los logo após uma única verificação. Isso torna a estrutura mais complexa do que o necessário.
	Como as condições dos quadrantes são mutuamente exclusivas, a solução pode ser simplificada usando if-else, já que só um quadrante será válido para cada coordenada.

	Verificação desnecessária dentro do loop:

	A verificação while (coordenadaX == 0 || coordenadaY == 0) é redundante, pois o loop externo já encerra o programa quando coordenadaX ou coordenadaY é igual a 0.
	Esse loop interno com System.out.print(""); não adiciona funcionalidade útil.
	
	Repetição de código:

	O prompt de "Digite os valores das coordenadas X e Y:" é repetido várias vezes no código, o que viola o princípio de evitar duplicação de código.

		System.out.println("Digite os valores das coordenadas X e Y:");

		int coordenadaX = sc.nextInt();
		int coordenadaY = sc.nextInt();

		while (coordenadaX != 0 && coordenadaY != 0) {

			while (coordenadaX == 0 || coordenadaY == 0) {
				System.out.print("");
				break;
			}

			while (coordenadaX > 0 && coordenadaY > 0) {
				System.out.println("QUADRANTE Q1");
				break;
			}

			System.out.println("Digite os valores das coordenadas X e Y:");
			coordenadaX = sc.nextInt();
			coordenadaY = sc.nextInt();

			while (coordenadaX < 0 && coordenadaY > 0) {
				System.out.println("QUADRANTE Q2");
				break;
			}


			while (coordenadaX < 0 && coordenadaY < 0) {
				System.out.println("QUADRANTE Q3");
				break;
			}


			while (coordenadaX > 0 && coordenadaY < 0) {
				System.out.println("QUADRANTE Q4");
				break;
			}

		}
*/