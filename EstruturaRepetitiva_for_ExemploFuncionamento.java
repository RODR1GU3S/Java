package Java;

public class EstruturaRepetitiva_for_ExemploFuncionamento {

	public static void main(String[] args) {

		// O laço for é uma òtima estrutura para se fazer uma repetição em um CONTAGEM

		// Contagem PROGRESSIVA "Incrementa SOMANDO"
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i SOMANDO: " + i);
		}
		System.out.println();

		// Contagem REGRESSIVA "Decrementa SUBTRAINDO"
		for (int i = 4; i >= 0; i--) {
			System.out.println("Valor de i SUBTRAINDO: " + i);
		}
		System.out.println();

		// Contagem PROGRESSIVA "Incrementa MULTIPLICANDO"
		for (int i = 2; i <= 10; i = i * 2) {
			System.out.println("Valor de i MULTIPLICANDO: " + i);
		}
		System.out.println();

		// Contagem PROGRESSIVA "Decrementa DIVIDINDO"
		for (int i = 10; i >= 2; i = i / 2) {
			System.out.println("Valor de i DIVIDINDO: " + i);
		}
		System.out.println();

		// Contagem PROGRESSIVA "RESTA "modulo ou mod"
		for (int i = 15; i >= 2; i = i % 3 + 1) {
		    System.out.println("Valor de i resta: " + i);
		}
		System.out.println();

		for (int variavel = 0; variavel < 5; variavel++) {
			System.out.println("Valor da variável: " + variavel);
		}
		System.out.println();
	}

}
