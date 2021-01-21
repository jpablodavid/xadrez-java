package xadrex;

import tabuleiroJogo.Position;
import tabuleiroJogo.Tabuleiro;
import xadrex.pecas.Rei;
import xadrex.pecas.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez () {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] matriz = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				matriz[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return matriz;
	}
	
	private void iniciarPartida() {
		tabuleiro.localPeca(new Torre(tabuleiro, Color.WHITE), new Position(2, 1));
		tabuleiro.localPeca(new Rei(tabuleiro, Color.BLACK), new Position(0, 4));
		tabuleiro.localPeca(new Rei(tabuleiro, Color.BLACK), new Position(7, 4));
	}

}
