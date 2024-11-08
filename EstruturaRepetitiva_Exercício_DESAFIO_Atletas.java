package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_Exercício_DESAFIO_Atletas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = "", nomeAtletaMaisAlto = "";
		char sexo;
		double altura = 0.0, porcentagemHomens = 0.0, alturasFeminina = 0.0, alturasFemininaMedia = 0.0, alturaMaior = 0.0, peso = 0.0, pesoMedio = 0.0, pesoTotal = 0.0;
		int quantidadeAtletas, sexoM = 0, sexoF = 0;

		quantidadeAtletas = 0;

		System.out.print("Qual a quantidade de atletas? ");
		quantidadeAtletas = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= quantidadeAtletas; i++) {

			System.out.println("Digite os dados do atleta numero " + i + " :");

			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Sexo: ");
			sexo = sc.nextLine().charAt(0);

			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.nextLine().charAt(0);
			}

			if (sexo == 'M') {
				sexoM = sexoM + 1;
			}
			else {
				sexoF = sexoF + 1;
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();

			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}

			if (sexo == 'F') {
				alturasFeminina = alturasFeminina + altura;
			}
			
			if ( altura >= alturaMaior) {
				alturaMaior = altura;
				nomeAtletaMaisAlto = nome;
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			sc.nextLine();

			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			if (peso > 0) {
				pesoTotal = pesoTotal + peso;
			}
		}
		System.out.println("\nRELATÓRIO:");

		pesoMedio = pesoTotal / quantidadeAtletas;
		System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);

		System.out.println("Atleta mais alto: " + nomeAtletaMaisAlto);

		porcentagemHomens = (double) sexoM / quantidadeAtletas * 100;
		System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagemHomens);

		if (sexoF <= 0) {
			System.out.println("Não há mulheres cadastradas");
		} 
		else {
			alturasFemininaMedia = alturasFeminina / sexoF;
			System.out.printf("Altura média das mulheres: %.2f\n", alturasFemininaMedia);
		}
		sc.close();
	}
}
