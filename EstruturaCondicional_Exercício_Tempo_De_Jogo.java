package Java;

import java.util.Scanner;

public class EstruturaCondicional_Exercício_Tempo_De_Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// Versão ChatGPT Aplicação de Clean Code e SOLID:

		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();

		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();

		int duracao = calcularDuracaoJogo(horaInicial, horaFinal);
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}

	public static int calcularDuracaoJogo(int horaInicial, int horaFinal) {

		if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23) {
			throw new IllegalArgumentException("Horas devem estar entre 0 e 23.");
		}

		if (horaFinal > horaInicial) {
			return horaFinal - horaInicial;
		} else {
			return 24 - horaInicial + horaFinal;
		}
	}
}
/* Versão ChatGPT:
 		int totalHorasJogada = 0;

		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();

		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();

		if (horaFinal > horaInicial) {
			totalHorasJogada = horaFinal - horaInicial;
		} else {
			totalHorasJogada = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU " + totalHorasJogada + " HORA(S)");		
*/

/*	Versão Ronaldo:

		int hora = 24;
		int horaInicial = 0;
		int horaFinal = 0;
		int meioDia = 12;
		int totalHorasJogada = 0;
		int tardeJogada = 0;
		int manhaJogada = 0;
		
		if (horaInicial < 0 || horaFinal < 0) {
			System.out.print("Informe uma hora válida");
		} else {
			if (horaInicial <= meioDia) {
				manhaJogada = meioDia - horaInicial;
			} else if (horaInicial <= hora) {
				manhaJogada = hora - horaInicial;
			}

			if (horaFinal <= meioDia) {
				tardeJogada = horaFinal;
			} else if (horaFinal <= hora) {
				tardeJogada = horaFinal - meioDia;
			}
			totalHorasJogada = manhaJogada + tardeJogada;
			System.out.println("O JOGO DUROU " + totalHorasJogada + " HORA(S)");
		}
*/

/*	Versão Prof. Nélio Alves

    	if (hinicial < hfinal) {
    		System.out.printf("O JOGO DUROU %d HORA(S)\n", hfinal - hinicial);
    	} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (hinicial - hfinal));
    	}
*/
