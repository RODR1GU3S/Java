package Java;

import java.util.Scanner;

public class EstruturaRepetitiva_while_Exercício_Médias_Idades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	// >> De acordo com os princípios de Clean Code, o while é a escolha mais adequada para essa solução.

		int idades = 0, quantidadeIdades = 0;
		double somaIdades = 0.0, mediaIdades = 0.0;;
				
		System.out.println("Digite as idades:");
		idades = sc.nextInt();
				
		if (idades < 0) {
			System.out.print("IMPOSSIVEL CALCULAR");
		} else {
			while(idades >= 0) {
				somaIdades = somaIdades + idades;
				quantidadeIdades = quantidadeIdades + 1;
				idades = sc.nextInt(); //>>>>>>>>>>>>>>>>>>>>>>>>>> Processamento da variável idades:
			}                                                  // > Após processar a primeira idade ex. 31, o comando idades = sc.nextInt(); dentro do laço
														       // >  faz uma nova leitura de entrada.
			mediaIdades = somaIdades / quantidadeIdades;       // > O novo valor inserido ex. 27 substitui o valor anterior de idades na memória.
			System.out.printf("MEDIA = %.2f\n", mediaIdades);  // > A cada iteração do laço, esse ciclo se repete e;
		}                                                      // > " o valor mais recente lido substitui o anterior".

		sc.close();
	}
}
/*   	
   	RESUMO DO FUNCIONAMENTO DA SINTESE >> idades = sc.nextInt();
		Primeira leitura: O valor 31 é lido e processado na primeira iteração.
		Segunda leitura: O valor 27 substitui 31, é processado e acumulado.
		Terceira leitura: O valor 46 substitui 27, é processado e acumulado.
		Quarta leitura: O valor -5 substitui 46, mas não é processado, pois interrompe o laço. 
	
  >> Abaixo TESTE aplicando o do-while para verificar qual código é mais eficiente. <<
  
		int idades, quantidadeIdades = 0;
		double somaIdades= 0.0, mediaIdades;
		
		System.out.println("Digite as idades:");
		idades = sc.nextInt();
		
		if (idades < 0) {
			System.out.print("IMPOSSIVEL CALCULAR");
		} else {
			do {
				somaIdades = somaIdades + idades;
				quantidadeIdades = quantidadeIdades + 1;
				idades = sc.nextInt();
				} while(idades >= 0);
			mediaIdades = somaIdades / quantidadeIdades;
			System.out.printf("MEDIA = %.2f\n", mediaIdades);
			}	
		}
 */
