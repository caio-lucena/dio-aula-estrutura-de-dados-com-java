package arvore.modelo;

public class NoBinario<T> implements Comparable<T> {
	
	private T conteudo;
	private NoBinario<T> noEsquerda;
	private NoBinario<T> noDireita;
	
	public NoBinario(T conteudo, NoBinario<T> noEsquerda, NoBinario<T> noDireita) {
		this.conteudo = conteudo;
		this.noEsquerda = noEsquerda;
		this.noDireita = noDireita;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoBinario<T> getNoEsquerda() {
		return noEsquerda;
	}

	public void setNoEsquerda(NoBinario<T> noEsquerda) {
		this.noEsquerda = noEsquerda;
	}

	public NoBinario<T> getNoDireita() {
		return noDireita;
	}

	public void setNoDireita(NoBinario<T> noDireita) {
		this.noDireita = noDireita;
	}

}
