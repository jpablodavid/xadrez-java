package xadrez;

import tabuleiroJogo.Pecas;
import tabuleiroJogo.Tabuleiro;

public class PecaDeXadrez extends Pecas{
	
	private Color color;

	public PecaDeXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
