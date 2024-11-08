package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_Senha_Fixa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int senha = 2002;
		int senhaInformada = 0;
		
		System.out.print("Digite a senha: ");
		do {
			
			senhaInformada = sc.nextInt();
			if (senhaInformada != senha) {
				System.out.print("Senha Invalida! Tente novamente: ");
			} else {
				System.out.println("Acesso permitido! ");
			}
			
			} while (senhaInformada != senha);
		
		sc.close();
	}
}
/*
 >> Meu código com loop while:

		int senha = 2002;
		int senhaInformada = 0;
		
		System.out.print("Digite a senha: ");
		senhaInformada = sc.nextInt();
		
		if ( senhaInformada != senha) {
			while (senhaInformada != senha) {
				System.out.print("Senha Invalida! Tente novamente: ");
				senhaInformada = sc.nextInt();
			}
		}
		System.out.println("Acesso permitido! ");
*/