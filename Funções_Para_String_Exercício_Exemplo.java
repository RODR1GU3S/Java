package Java;

public class Funções_Para_String_Exercício_Exemplo {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG     ";
		System.out.println("Original: -" + original + "-");
		
		
		// Imprimirá todo texto em minúsculo
		String s01 = original.toLowerCase();
		System.out.println("toLowerCase: -" + s01 + "-");
		
		// Imprimirá todo texto em maiúculo
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase: -" + s02 + "-");
		
		// Imprimirá o texto original ELIMINANDO os espaços
		String s03 = original.trim();
		System.out.println("trim: -" + s03 + "-");
		
		// Imprimirá o texto a partir do PRIMEIRO caracter escolhido
		// beginIndex = 2: O primeiro índice a ser cortado.
		// Como em Java as strings são indexadas a partir de 0, o índice 2 corresponde ao terceiro caractere da string original, que é "c". 
		// Exemplo a partir do caracter 2 em diante a=0, b=1, e c=2" >> Resultado: cde FGHIJ ABC abc DEFG 
		String s04 = original.substring(2);
		System.out.println("trim: -" + s04 + "-");
		
		// Imprimirá o texto a partir do PRIMEIRO caracter escolhido até o ÚLTIMO caracter escolhido
		// endIndex = 9: O índice onde a sub-string termina, não incluindo o caractere nesse índice.
		// Portanto, a sub-string vai até o índice 8 (9-1), que corresponde ao caractere "I". 
		// Exemplo a partir do caracter 2 em diante a=0, b=1, e c=2" ATÉ o I=9 >> Resultado: cde FGH 
		String s05 = original.substring(2, 9);
		System.out.println("trim: -" + s05 + "-");
		
		// Substitui o caracter desejado
		String s06 = original.replace('a', 'x');
		System.out.println("replace ('a', 'x'): -" + s06 + "-");
		String s07 = original.replace("abc", "xy");
		System.out.println("replace ('abc', 'xy'): -" + s07 + "-");
		
		// Busca a Primeira e a ùltima ocorrência de algum argumento
		int i = original.indexOf("bc");
		System.out.println("index Of 'bc': " + i);
		int j = original.lastIndexOf("bc");
		System.out.println("lastIndex Of 'bc': " + j);
		
		// Operação split, serve para recortar uma String "um texto"
		String s = "potato apple lemon";
		String [] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}
}
/*
 Checklist
	• Formatar: toLowerCase(), toUpperCase(), trim()
	• Recortar: substring(inicio), substring(inicio, fim)
	• Substituir: Replace(char, char), Replace(string, string)
	• Buscar: IndexOf, LastIndexOf
	• Recortar com base em um separador:str.Split(" ")
*/