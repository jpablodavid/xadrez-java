package tabuleiroJogo;

public class Pecas {
	
	protected Position position;
	private Tabuleiro tabuleiro;
	
	public Pecas() {}

	public Pecas(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		position = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
