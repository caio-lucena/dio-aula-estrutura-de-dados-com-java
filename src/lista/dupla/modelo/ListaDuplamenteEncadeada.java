package lista.dupla.modelo;

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
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;		
		tamanhoLista++;
		
	}
	
	public void add(T elemento, int index) {
		NoDuplo<T> noAux = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		
		novoNo.setNoProximo(noAux);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoAnterior(noAux.getNoAnterior());
			novoNo.getNoProximo().setNoAnterior(novoNo);;
		}
		else {
			novoNo.setNoAnterior(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		}
		else {
			novoNo.getNoAnterior().setNoProximo(novoNo);
		}
		
		tamanhoLista++;
		
	}
	
	public void remove(int index) {
		
		
		try {
			
			if(index == 0) {
				primeiroNo = primeiroNo.getNoProximo();
				
				if(primeiroNo != null) {
					primeiroNo.setNoAnterior(null);
				}
			}
			else {
				NoDuplo<T> noAux = getNo(index);
				noAux.getNoAnterior().setNoProximo(noAux.getNoProximo());
				
				if(noAux != ultimoNo) {
					noAux.getNoProximo().setNoAnterior(noAux.getNoAnterior());
				}
				else {
					ultimoNo = noAux;
				}
				
			}
			
		}catch (NullPointerException ex) {
			System.out.println("Erro: " + ex.getLocalizedMessage());
		}
		
		this.tamanhoLista--;
	}

	@Override
	public String toString() {
		
		String strRetorno = "";
		NoDuplo<T> noAux = primeiroNo;
		
		for(int i = 0; i < size(); i++) {
						
			strRetorno += "Nó [ = { conteúdo: " + noAux.getConteudo() + "} ]";
			noAux = noAux.getNoProximo();
		}
		
		strRetorno += "null";
		
		return strRetorno;
	}
	
	

}
