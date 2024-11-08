package Java;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_for_Exercício_Soma_Impares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	// Código do Prof. Nélio Alves:
		
		int x, y, soma, troca;

		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}

		soma = 0;
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}

		System.out.printf("SOMA DOS IMPARES = %d\n", soma);

		sc.close();
	}
}
/* >> Análise do Código do Prof. Nélio Alves: 

	1. Verificação e Troca para Definir o Intervalo Correto
	
	 int x = sc.nextInt();     >> // Exemplo: 10
        int y = sc.nextInt();  >> // Exemplo: 3
        int troca;
        
     // Verificação e troca
	 if (x > y) {
	     troca = x;  >> // Armazena o valor de x (10) em troca
         x = y;      >> // Atribui o valor de y (3) a x
         y = troca;  >> // Atribui o valor de troca (10) a y
     }
     
     // Resultado da troca
        System.out.println("Valores após a verificação:");
        System.out.println("x = " + x);   >> // Esperado: x = 3
        System.out.println("y = " + y);   >> // Esperado: y = 10
        
	* Explicação do Funcionamento da Troca

     1. Entrada dos Valores:

      Suponha que o usuário digite x = 10 e y = 3.

     2. Verificação da Condição if (x > y):

      O código verifica se x é maior que y. Como 10 > 3 é verdadeiro, o bloco de troca é executado.

     3. Processo da Troca:

      troca = x; >> armazena o valor de x (10) na variável temporária troca.
      x = y; >> redefine x com o valor de y (3).
      y = troca; >> redefine y com o valor de troca (10).

    4. Resultado Final:

     Após a troca, temos x = 3 e y = 10, garantindo que x seja o menor e y o maior.


     Esse bloco de código verifica se x é maior que y.
      Caso seja, ele inverte os valores, garantindo que x seja sempre o menor e y o maior.
       Isso ajuda a estruturar o loop corretamente, garantindo que ele percorra os números entre x e y,
        independentemente da ordem de entrada.

	2. Cálculo da Soma dos Ímpares
	
	 soma = 0;
     for (int i = x + 1; i < y; i++) {
         if (i % 2 != 0) {
             soma = soma + i;
         }
     }
	
	A variável soma é inicializada em 0.
     O loop for começa de x + 1 e vai até y - 1, excluindo x e y do intervalo, como especificado.
     Dentro do loop, a condição if (i % 2 != 0) verifica se i é ímpar. Se for, o valor de i é adicionado a soma.
*/

/* >> Explicação do Código do ChatGPT:

		System.out.println("Digite dois numeros:");
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int menor = Math.min(X, Y);
		int maior = Math.max(X, Y);
		int somaImpares = 0;

		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				somaImpares += i;
			}
		}

		System.out.println("SOMA DOS IMPARES = " + somaImpares);

	  1. Definir o Intervalo entre X e Y:

	   Usamos Math.min(X, Y) e Math.max(X, Y) para determinar o menor e o maior entre os valores de X e Y,
	    independentemente da ordem de entrada.

      2. Iterar Entre o Menor e o Maior Número:

       Utilizamos um único loop para iterar entre o menor e o maior número, excluindo ambos (i = menor + 1; i < maior).
        Isso garante que o loop só considere os valores intermediários.

      3. Somar Apenas os Números Ímpares:

       Dentro do loop, verificamos se i é ímpar (i % 2 != 0). Se for, adicionamos i a somaImpares.

 */

/* >> ABAIXO >> Meu código; + considerações do ChatGPT: 

       Problemas identificados no código
       
       	1. Loop Inadequado para Calcular a Soma de Ímpares entre X e Y:
       	
		 O código atual usa quatro loops separados,
		  e eles não estão adequados para o cálculo da soma de números ímpares entre os dois números X e Y.

		 A lógica precisa somar todos os ímpares entre X e Y,
		  independentemente da ordem de entrada (X pode ser maior ou menor que Y).
		  
		 Além disso, as variáveis somaX e somaY são redundantes; basta uma única variável somaImpares.
		
		2. Estrutura Condicional Inadequada para o Cálculo da Soma:

		 A lógica de comparação entre somaX e somaY para determinar somaImpares não faz sentido no contexto do problema,
		  pois não estamos interessados em subtrair as somas, mas sim em calcular a soma dos números ímpares entre X e Y.

		3. Confusão com Números Negativos:

		 A verificação de soma negativa (somaX < 0 ou somaY < 0) não é necessária,
		  pois a soma dos ímpares deve simplesmente considerar os valores entre X e Y,
		   independentemente de serem positivos ou negativos.

   		System.out.println("Digite dois numeros:");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int somaX = 0, somaY = 0, somaImpares = 0;
			
		for (int i = 0; i < X; i++) {
			if (i % 2 != 0) {
				somaX = somaX + i;
			}
		}
		
		for (int i = 0; i > X; i--) {
			if (i % 2 != 0) {
				somaX = somaX + i;
			}
		}

		for (int i = 0; i < Y; i++) {
			if (i % 2 != 0) {
				somaY = somaY + i;
			}
		}
		
		for (int i = 0; i > Y; i--) {
			if (i % 2 != 0) {
				somaY = somaY + i;
			}
		}
		
		if ( somaX > somaY) {
			somaImpares = somaX - somaY;
		} else if (somaY > somaX) {
			somaImpares = somaY - somaX;
		} 

		if ( somaX < 0) {
			somaImpares = somaY + somaX;
		} else if (somaY < 0) {
			somaImpares = somaX + somaY;
		}  
		
		System.out.print("SOMA DOS IMPARES = " + somaImpares);

*/
