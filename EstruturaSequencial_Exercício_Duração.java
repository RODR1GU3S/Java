package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_Exercício_Duração {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int duracao, horas, minutos, segundos, resto;

		System.out.print("Digite a duracao em segundos: ");
		duracao = sc.nextInt();

		// Calcula quantas horas correspondem à duração
		horas = duracao / 3600; // 3600 segundos em uma hora

		// Calcula o resto em segundos após determinar as horas
		resto = duracao % 3600; // O que sobra em segundos após calcular as horas

		// Calcula quantos minutos há no restante
		minutos = resto / 60; // 60 segundos em um minuto
		// Calcula os segundos restantes após calcular os minutos
		segundos = resto % 60; // O que sobra em segundos após calcular os minutos

		// Exibe a duração formatada como horas:minutos:segundos
		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}
}
