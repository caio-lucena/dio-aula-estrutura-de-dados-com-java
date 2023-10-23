package fila.modelo;

public class Fila<T>{
	
	private No<T> referenciaEntrada;
	
	public Fila() {
		this.referenciaEntrada = null;
	}
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true: false;
	}
	
	public void enqueue(T object) {
		
		No<T> novoNo = new No<T>(object);
		
		novoNo.setReferenciaNo(referenciaEntrada);
		referenciaEntrada = novoNo;
		
	}
	
	public T first() {
		No<T> primeiroNo = referenciaEntrada;
		
		if(!this.isEmpty()) {
			
			while(true) {
				
				if(primeiroNo.getReferenciaNo() != null) {
					primeiroNo = primeiroNo.getReferenciaNo();
				}
				else {
					break;
				}				
			}			
		}
		return primeiroNo.getObject();
		
	}
	
	public T dequeue() {
		
		No<T> primeiroNo = referenciaEntrada;
		No<T> noAuxiliar = referenciaEntrada;
		
		if(!this.isEmpty()) {
					
			while (true) {
				
				if(primeiroNo.getReferenciaNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferenciaNo();
					
				}
				else {
					noAuxiliar.setReferenciaNo(null);
					break;
				}
			}
			
		}
		
		return primeiroNo.getObject();
	}

	@Override
	public String toString() {
		
		String stringImpressao = "";		
		No<T> noAuxiliar = referenciaEntrada;
		
		if(referenciaEntrada != null) {
			
			while(true) {
				stringImpressao += "[No {Objeto: " + noAuxiliar.getObject() + "}]--->";
				
				if(noAuxiliar.getReferenciaNo() != null) {					
					noAuxiliar = noAuxiliar.getReferenciaNo();					
				}
				else {
					stringImpressao += "Nulo";
					break;
				}
			}
			
		}
		else {
			stringImpressao = "Fila vazia";
		}
				
		return stringImpressao;
		
	}

}
