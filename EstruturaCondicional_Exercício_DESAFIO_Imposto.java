package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_Exercício_DESAFIO_Imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaAnual, rendaMensal, prestacaoServico, rendaCapital, impostoSalario = 0, impostoServico, impostoCapital, impostoDedutivel =0, impostoDevido = 0, impostoBrutoTotal, gastosMedicos, gastosEducacionais;
		
		System.out.print("Renda anual com salário: ");
		rendaAnual = sc.nextDouble();
		
		System.out.print("Renda anual com prestação de serviço: ");
		prestacaoServico = sc.nextDouble();

		System.out.print("Renda anual com ganho de capital: ");
		rendaCapital = sc.nextDouble();
		
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();
		
		rendaMensal = rendaAnual / 12;
		if (rendaMensal < 3000) {
			System.out.print("Isento");
		} else if (rendaMensal <= 5000) {
			impostoSalario = (rendaAnual * 0.10);
		} else {
			impostoSalario = (rendaAnual * 0.20);
		}

		System.out.print("\nRELATÓRIO DE IMPOSTO DE RENDA \n");
		
		System.out.print("\nCONSOLIDADO DE RENDA:\n");
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
		impostoServico = (prestacaoServico * 0.15);
		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
		impostoCapital = (rendaCapital * 0.20);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
		
		impostoBrutoTotal = impostoSalario + impostoServico + impostoCapital;
		
		System.out.print("\nDEDUÇÕES:\n");
		impostoDedutivel = (impostoBrutoTotal * 0.30);
		if ((gastosMedicos + gastosEducacionais) < impostoDedutivel) {
			impostoDevido = gastosMedicos + gastosEducacionais;
		} else {
			impostoDevido = impostoDedutivel;
		}
		
		System.out.printf("Máximo dedutível: %.2f\n", impostoDedutivel);
		
		System.out.printf("Gastos dedutíveis: %.2f\n", (gastosMedicos + gastosEducacionais));
		
		System.out.print("\nRESUMO:\n");
		System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
		System.out.printf("Abatimento: %.2f\n", impostoDevido);
		
		System.out.printf("Imposto devido: %.2f\n", impostoBrutoTotal - impostoDevido);
		
		sc.close();
	}
}
