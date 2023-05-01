package entities;

public class Elemento {
	private Long valor;
	private Elemento esquerda;
	private Elemento direita;
	
	public Elemento(long valor) {
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}
	
	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public Elemento getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento getDireita() {
		return direita;
	}

	public void setDireita(Elemento direita) {
		this.direita = direita;
	}
	
	
}
