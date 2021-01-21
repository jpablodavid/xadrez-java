package tabuleiroJogo;

import xadrez.PecaDeXadrez;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Pecas[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroException("ERRO, Precisa no minimo de 1 linha e 1 coluna para criar tabuleiro");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Pecas[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	
	public int getColunas() {
		return colunas;
	}

		
	public Pecas peca(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Pecas peca(Position posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void localPeca(Pecas peca, Position posicao) {
		if(temUmaPeca(posicao)) {
			throw new TabuleiroException("Já existe uma peça nessa posição");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.position = posicao;
	} 
	
	private boolean posicaoExiste(int linha, int coluna) {
		return (linha >= 0 && linha < linhas) 
		&& (coluna >=0 && coluna < colunas);
	}
	
	public boolean posicaoExiste(Position posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Position posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
