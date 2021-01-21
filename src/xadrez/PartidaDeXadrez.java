package xadrez;

import tabuleiroJogo.Position;
import tabuleiroJogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

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
	
	private void placeNewPiece(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.localPeca(peca, new XadrezPosition(coluna, linha).toPosition());
	}
	
	private void iniciarPartida() {
		placeNewPiece('b', 6, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('e', 8, new Rei(tabuleiro, Color.BLACK));
		placeNewPiece('e', 1, new Rei(tabuleiro, Color.BLACK));
	}

}
