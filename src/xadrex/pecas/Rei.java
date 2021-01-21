package xadrex.pecas;

import tabuleiroJogo.Tabuleiro;
import xadrex.Color;
import xadrex.PecaDeXadrez;

public class Rei extends PecaDeXadrez{

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}

	@Override
	public String toString() {
		return "K";
	}
}
