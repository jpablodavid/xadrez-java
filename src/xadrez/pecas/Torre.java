package xadrez.pecas;

import tabuleiroJogo.Tabuleiro;
import xadrez.Color;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez{

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}

	@Override
	public String toString() {
		return "T";
	}

}
