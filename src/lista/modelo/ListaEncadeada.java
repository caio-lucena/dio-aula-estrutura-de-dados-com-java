package lista.modelo;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true : false;
	}

	public T get(int index) {
		return this.getNo(index).getConteudo();
	}

	private No<T> getNo(int index) {

		this.validarIndice(index);

		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;

		for (int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}

		return noRetorno;
	}

	private void validarIndice(int index) {

		if (index >= this.size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice: " + index);
		}

	}

	public Integer size() {
		Integer tamanhoLista = 0;

		No<T> referenciaAuxiliar = referenciaEntrada;

		while (true) {

			if (referenciaAuxiliar != null) {
				tamanhoLista++;

				if (referenciaAuxiliar.getProximoNo() != null) {
					referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}

		return tamanhoLista;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);

		if (this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}

		No<T> noAuxiliar = referenciaEntrada;

		for (int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}

		noAuxiliar.setProximoNo(novoNo);
	}
	
	public T remove(int index) {
		No<T> noPivo = this.getNo(index);
		
		if(index == 0) {
			referenciaEntrada = noPivo.getProximoNo();
			return noPivo.getConteudo();
		}
		
		No<T> noAnterior = getNo( -1);
		noAnterior.setProximoNo(noPivo.getProximoNo());
		
		return noPivo.getConteudo();
	}

	@Override
	public String toString() {
		
		String stringRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		
		for (int i = 0; i < this.size(); i++) {
			
			stringRetorno += "No [ " + noAuxiliar.getConteudo() + "] --->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		stringRetorno += " Null";
		
		return "ListaEncadeada [referenciaEntrada=" + stringRetorno + "]";
	}

}
