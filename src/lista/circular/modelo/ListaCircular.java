package lista.circular.modelo;

public class ListaCircular <T>{
	
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public int size() {
		return this.tamanhoLista;
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true: false;
	}

}
