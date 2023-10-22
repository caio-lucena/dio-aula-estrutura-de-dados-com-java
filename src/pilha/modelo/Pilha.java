package pilha.modelo;

public class Pilha {
	
	private No referenciaNoEntradaPilha;
	
	public Pilha() {
		this.referenciaNoEntradaPilha = null;
	}
	
	public boolean isEmpty() {
		var isEmpty = this.referenciaNoEntradaPilha == null? true: false;
		
		return isEmpty;
	}
	
	public void push(No novoNo) {
		No referenciaAuxiliar = this.referenciaNoEntradaPilha;
		this.referenciaNoEntradaPilha = novoNo;
		this.referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);
		
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No popedNo = this.referenciaNoEntradaPilha; // guarda o nó "popado" pra poder usar depois
			referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo(); // guarda a referência do nó abaixo
			
			return popedNo;
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		String stringImpressao = "----------------------\n";
		stringImpressao += "Pilha: \n";
		stringImpressao += "----------------------\n";
		
		No noAuxiliar = this.referenciaNoEntradaPilha;
		
		while(true) {
			
			if(noAuxiliar != null) {				
				
				stringImpressao += "[dados: " + noAuxiliar.getDado() + "]\n";
				noAuxiliar = noAuxiliar.getReferenciaNo();
			}
			else {
				break;
			}
		}
		
		return stringImpressao;
	}
	
	

}
