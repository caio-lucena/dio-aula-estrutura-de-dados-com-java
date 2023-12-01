package arvore.modelo.objetos.implemetacao;

import java.util.Objects;

import arvore.modelo.objetos.interfaces.ObjetoArvore;

public class ObjetoArvoreImplementacao extends ObjetoArvore<ObjetoArvoreImplementacao> {
	
	private Integer meuValor;	

	public ObjetoArvoreImplementacao(int meuValor) {
		this.meuValor = meuValor;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(meuValor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoArvoreImplementacao other = (ObjetoArvoreImplementacao) obj;
		return meuValor == other.meuValor;
	}

	@Override
	public int compareTo(ObjetoArvoreImplementacao outro) {
		int i = 0;
		
		if(this.meuValor > outro.getMeuValor()) {
			i = 1;
		}
		else if (this.meuValor < outro.getMeuValor()) {
			i = -1;
		}
		else {
			i = 0;
		}
		
		return i;
	}

	@Override
	public String toString() {		
		return meuValor.toString();
	}

	public Integer getMeuValor() {
		return meuValor;
	}

	public void setMeuValor(Integer meuValor) {
		this.meuValor = meuValor;
	}

}
	