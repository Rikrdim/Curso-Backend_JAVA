package _03_Estruturas_repetitivas;

public class _01_Utilizando_o_DEBUG {

	public static void main(String[] args) {


		// O DEBUG é uma ferramenta que facilita a investigação de erros no código. Apontando exatamente o que acontece linha a linha

		
		// _______________ PASSO 1 - MARCANDO UMA LINHA DE BREAKPOINT _______________
		
		
		// O breakpoint serve para marcar uma linha de código específica para que a partir dalí, se inicie a investigação do erro.
		
		// EXEMPLO PRÁTICO:
		// No exemplo abaixo temos a situação, onde o cliente quer um programa que leia a largura, comprimento e metro quadrado e
		// calcule a área e o preço do terreno para mostrar na tela.
		
		
		// import java.util.Locale;
		// import java.util.Scanner;
		
		
		// public class main {
		// 		public static void main(String[] args) {
		//
		//			Locale.setDefault(Locale.US);
		//			Scanner sc = new Scanner(System.in);
		//			
		//			double largura = sc.nextDouble();
		//			double comprimento = sc.nextDouble();
	//	  °32		double metroQuadrado = sc.nextDouble();      BREAKPOINT NESTA LINHA 32
		//
		//			double area = largura * comprimento;
		//			double preco = area * metroQuadrado;
		//
		//			System.out.printf("ÁREA = %.2f%n", area);
		//			System.out.printf("PREÇO = %.2f%n", preco);
		//
		//		sc.close();
		// 	}
		//}
		
		
		// Supondo que queremos analisar especificamente a linha 32. Com o breakpoint nessa linha, TUDO o que está antes, irá rodar
		// normalmente e quando chegar nesse breakpoint, a ferramente irá parar para análise.
		
		// Para inserir o breakpoint, mantem a marcação de edição na linha a ser analisada, vai em > RUN > TOGGLE BREAKPOINT ou
		//		Ctrl + shift + B ou clica com o botão direito do mouse em cima do N° da linha e seleciona TOGGLE BREAKPOINT
		
		// Fazendo esse passo, aparecerá uma marcação (bolinha) ao lado do N° da linha.
		
		// Para remover, basta repetir o processo de inserir e verificar se a marcação (bolinha) saiu do lado do N° da linha.
		
// *****************************************************************************************************************
		
		// _______________ PASSO 2 - INICIANDO O DEBUG _______________
		
		
		// 	Para iniciar a execução do debug na classe, segue o processo:
		
		// Clica com o botão direito do mouse na classe ( a classe em questão, é a classe criada nos arquivos que ficam dentro
		//	do package, a esquerda) > DEBUG AS > JAVA APLICATION
		
		// A aplicação irá rodar normalmente até chegar na linha marcada pelo breakpoint.
		//
		// Onde por sua vez a ferramenta de DEBUG do eclipse irá perguntar, se deseja mudar pra visualização/perspectiva de DEBUG.
		
		// Essa perspectiva é a mais adequada para se trabalhar com o DEBUG, pq nela se encontra visível somente o necessário para
		// verificar onde tem erros no código.
		//
		// Essa visualização tras à área do código indicando a proxima linha de execução, uma área de retorno dos dados, o status do
		// DEBUG e a resposta do console.
		
// *****************************************************************************************************************
		
		// _______________ PASSO 3 - EXECUTAR O DEBUG LINHA A LINHA (F6) _______________
				
		
		// Com o breakpoint ativado, precisamos avançar a linha do código, para execução da aplicação, desta forma:
		
		//                Botão F6 do teclado ou no botão STEP OVER dos atalhos do eclipse.
		
		// Desta forma, passamos/analisamos linha a linha de forma manual. Precisando ou não da interação com o console. 

// *****************************************************************************************************************
		
		// _______________ PASSO 4 - INTERROMPER O DEBUG _______________
		
		
		// Ao chegar no ponto onde foi encontrado o erro e corrigido. Precisamos interromper o DEBUG, para que a aplicação
		// 	continue com o fluxo natural. Desta forma:
		
		//                Botão TERMINATE dos atalhos do eclipse ou Ctrl + F2 do teclado.
		
		// Desta forma o Status do DEBUG vai indicar que a execução foi interrompida e o fluxo irá seguir normalmente.
		
	}

}
