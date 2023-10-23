package fila.modelo;

public class Fila {
	
	private No referenciaEntrada;
	
	public Fila() {
		this.referenciaEntrada = null;
	}
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true: false;
	}
	
	public void enqueue(No novoNo) {
		novoNo.setReferenciaNo(referenciaEntrada);
		referenciaEntrada = novoNo;
		
	}
	
	public No first() {
		No primeiroNo = referenciaEntrada;
		
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
		return primeiroNo;
		
	}
	
	public No dequeue() {
		
		No primeiroNo = referenciaEntrada;
		No noAuxiliar = referenciaEntrada;
		
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
		
		return primeiroNo;
	}

	@Override
	public String toString() {
		
		String stringImpressao = "";		
		No noAuxiliar = referenciaEntrada;
		
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
