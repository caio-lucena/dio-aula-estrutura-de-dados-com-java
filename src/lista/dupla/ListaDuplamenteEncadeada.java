package lista.dupla;

public class ListaDuplamenteEncadeada <T> {
	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada () {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> noAux = primeiroNo;
		
		for(int i = 0; (i < index) && (noAux != null); i++) {
			noAux = noAux.getNoProximo();
		}
		
		return noAux;
	}
	
	public T get(int index){
		return this.getNo(index).getConteudo();
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		
		novoNo.setNoProximo(null);
		novoNo.setNoAnterior(ultimoNo);
		
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo == null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;		
		tamanhoLista++;
		
	}

}
