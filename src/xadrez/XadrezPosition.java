package xadrez;

import tabuleiroJogo.Position;

public class XadrezPosition {
	
	private int linha;
	private char coluna;
	
	public XadrezPosition(char coluna, int linha) {
		if((coluna < 'a' || coluna > 'h') || (linha < 1 || linha > 8)) {
			throw new XadrezException("ERRO posi��o. Valores validos: colunas de A at� H e linhas de 1 at� 8");
		}
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public char getColuna() {
		return coluna;
	}
	
	//trasnforma a posi��o que o usuario digita em posi��o na matriz que constroi o tabuleiro
	protected Position toPosition() {
		return new Position(8 - linha, coluna - 'a');
	}
	
	//faz o inverso do metodo acima(toPosition).
	protected static XadrezPosition fromPosition(Position posicao) {
		return new XadrezPosition((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	// coloca ("") na frente para poder concatenar a coluna com a linha na String
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
	
	
}
