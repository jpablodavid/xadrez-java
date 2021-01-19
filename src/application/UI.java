package application;

import xadrex.PecaDeXadrez;

public class UI {
	
	//imprimir tabuleiro
	public static void printTabuleiro(PecaDeXadrez[][] pecas){
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				printPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	//imprimir uma pe�a, sem pe�a imprimi - , se n�o imprimi pe�a, depois imprimi espa�o
	private static void printPeca(PecaDeXadrez peca) {
		if (peca == null) {
			System.out.print("-");
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
