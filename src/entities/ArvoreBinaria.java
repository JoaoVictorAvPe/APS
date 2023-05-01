package entities;

public class ArvoreBinaria {
	private Elemento raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}
	

	public void adicionar(long i) {
		Elemento novoElemento = new Elemento(i);
		if (raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento atual = this.raiz;
			while (true) {
				if (novoElemento.getValor() < atual.getValor()) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else {
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}

	public Long buscar(long valor) {
		long qtdNos = 1;
		Elemento atual = raiz;
		while (true) {
			if (valor <= atual.getValor()) {
				if (valor == atual.getValor()) {
					break;
				} else {
					atual = atual.getEsquerda();
					qtdNos ++;
				}
			} else {
				atual = atual.getDireita();
				qtdNos ++;
			}
		}
		return qtdNos;
	}

	public Elemento getRaiz() {
		return raiz;
	}

	public void setRaiz(Elemento raiz) {
		this.raiz = raiz;
	}
	
	
}
