package _01_Primeiros_conhecimentos;

public class _04_Funcoes_para_String {

	public static void main(String[] args) {
		
		
		// Checklist
		
		//  	FUNÇÃO PARA:
		/*  
		 
		 * Formatar : toLowerCase();  [ Transformar para minúsculo ]
					  :	toUpperCase();  [ Transformar para maiúsculo ]
					  : trim();         [ Remover espaços ]
		
		 * Recortar : substring(inicio)       [ Recorte da substring no inicio ]
					  : substring(inicio, fim)  [ Recorte da substring no inicio e fim ]
		
		 * Substituir : Replace(char,char)      [ Substituir caractere ]
						: Replace(string,string)  [ Substituir string ]
		
		 * Buscar : IndexOf      [ Buscar a posição ]
					: LastIndexOf  [ Buscar a posição ]
		
		 * str.Split(" ")  [ Recortar string com base no separador que será definido dentro das aspas ]
		 
		*/
		
		
		// EXEMPLO PRÁTICO
		
			String original = "abcde FGHI ABC abc DEFG ";
			String s01 = original.toLowerCase();
			String s02 = original.toUpperCase();
			String s03 = original.trim();
			String s04 = original.substring(2);   // Função para pegar do segundo caractere em diante, pois foi definido (2)
			String s05 = original.substring(2, 9);   // Função para pegar do segundo caractere até o 9, pois foi definido (2, 9)
			String s06 = original.replace('a', 'x');   // Função para substituir uma coisa por outra, no caso o A pelo X
			String s07 = original.replace("abc", "xy");   // Função para substituir uma coisa por outra, no caso o ABC por XY, mas com string
			int i = original.indexOf("bc");   // Descobrir a primeira posição de BC no exemplo da string otiginal
			int j = original.lastIndexOf("bc");   // Descobrir a ultima posição de BC no exemplo da string otiginal
			
			System.out.println("Original: -" + original + "-");
			System.out.println("toLowercase: -" + s01 + "-");
			System.out.println("toUpperCase: -" + s02 + "-");
			System.out.println("Trim: -" + s03 + "-");	
			System.out.println("Substring início: -" + s04 + "-");
			System.out.println("Substring início e fim: -" + s05 + "-");
			System.out.println("Replace('a', 'x'): -" + s06 + "-");
			System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
			System.out.println("Index of 'bc': " + i);
			System.out.println("Last Index of 'bc': " + j);
			
			System.out.println(" ");
			System.out.println("***************************************************");
			System.out.println(" ");
			
			//RESPOSTAS:
			
		/*
			 Original: -abcde FGHI ABC abc DEFG -
			 toLowercase: -abcde fghi abc abc defg -
			 toUpperCase: -ABCDE FGHI ABC ABC DEFG -
			 Trim: -abcde FGHI ABC abc DEFG-
			 Substring início: -cde FGHI ABC abc DEFG -
			 Substring início e fim: -cde FGH-
			 Replace('a', 'x'): -xbcde FGHI ABC xbc DEFG -
			 Replace('abc', 'xy'): -xyde FGHI ABC xy DEFG -
			 Index of 'bc': 1
			 Last Index of 'bc': 16
		*/
		
	// *******************************************************************
			
		/*
			 Split é uma função que serve pra recortar o string, com a utilização de vetores. No exemplo abaixo, na mesma string
			 tem 3 palavras separadas por espaços em branco. Desta forma, pega as 3 palavras e separa 1 em cada espaço.
		*/
			
			// Exemplo usando SPLIT
			
			String s = "potato apple lemon";
					
			String[] vect = s.split(" ");
			
			System.out.println(vect[0]);
			System.out.println(vect[1]);
			System.out.println(vect[2]);
			
			
			//RESPOSTAS
		/*
			 potato
			 apple
			 lemon
		*/	
			
			
			System.out.println(" ");
			System.out.println("***************************************************");
			System.out.println(" ");
	}

}
