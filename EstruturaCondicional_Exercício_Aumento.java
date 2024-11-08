package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_Aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	/*
	  A Lógica do Prof. Nélio Alves é mais clara e eficiente, de acordo com os princípios de Clean Code:
		               
		Legibilidade: Atribui porcentagem antes de calcular aumento e novosalario, tornando o fluxo de lógica mais intuitivo.

		Reuso de Código: Evita a repetição da expressão (aumento / salario) * 100 em cada bloco de if.

		Correção: Garante a formatação correta do símbolo %.
	
	*/
		double salario, novosalario, aumento;
        int porcentagem = 0;

        System.out.print("Digite o salario da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000.0) {
            porcentagem = 20;
            aumento = salario * porcentagem / 100;
            novosalario = salario + aumento;
        } else if (salario <= 3000.0) {
            porcentagem = 15;
            aumento = salario * porcentagem / 100;
            novosalario = salario + aumento;
        } else if (salario <= 8000.0) {
            porcentagem = 10;
            aumento = salario * porcentagem / 100;
            novosalario = salario + aumento;
        } else {
            porcentagem = 5;
            aumento = salario * porcentagem / 100;
            novosalario = salario + aumento;
        }

        System.out.printf("Novo salario = R$ %.2f\n", novosalario);
        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.printf("Porcentagem = %d %%\n", porcentagem);
		
		sc.close();
	}
}

/*     MEU CÓDIGO     
double salario, novoSalario, aumento, porcentagem;

System.out.print("Digite o salario da pessoa: ");
salario = sc.nextDouble();

if (salario <= 1000) {
	novoSalario = salario + (salario * 0.20);
	aumento = novoSalario - salario;
	porcentagem = (aumento / salario) * 100;

} else if (salario <= 3000) {
	novoSalario = salario + (salario * 0.15);
	aumento = novoSalario - salario;
	porcentagem = (aumento / salario) * 100;

} else if (salario <= 8000) {
	novoSalario = salario + (salario * 0.10);
	aumento = novoSalario - salario;
	porcentagem = (aumento / salario) * 100;

} else {
	novoSalario = salario + (salario * 0.05);
	aumento = novoSalario - salario;
	porcentagem = (aumento / salario) * 100;

}
System.out.printf("Novo salario R$ = %.2f\n", novoSalario);
System.out.printf("Aumento = R$ %.2f\n", aumento);
System.out.printf("Porcentagem = %.0f %%\n", porcentagem);
*/
