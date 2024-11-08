package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_Exercício_Pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		double valorHora,valorPagar;
		int horasTrabalhadas;
		
		System.out.print("Nome: ");
		name = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		valorPagar = valorHora * horasTrabalhadas;
		System.out.printf("O pagamento para %s deve ser %.2f\n", name, valorPagar);
		
		sc.close();
	}
}
