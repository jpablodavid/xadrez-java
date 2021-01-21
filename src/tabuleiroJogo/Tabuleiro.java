package tabuleiroJogo;

import xadrex.PecaDeXadrez;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Pecas[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Pecas[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Pecas peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Pecas peca(Position posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void localPeca(Pecas peca, Position posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.position = posicao;
	} 
}
