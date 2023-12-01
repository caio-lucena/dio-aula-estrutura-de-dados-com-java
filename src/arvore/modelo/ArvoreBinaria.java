package arvore.modelo;

public class ArvoreBinaria<T extends Comparable<T>> {
	
	private NoBinario<T> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void inserir(T conteudo) {
		NoBinario<T> novoNo = new NoBinario<T>(conteudo);
		this.raiz = inserir(raiz, novoNo);
	}
	
	private NoBinario<T> inserir(NoBinario<T> atual, NoBinario<T> novoNo){
		
		if(atual == null) {
			return novoNo;
		}
		else if(novoNo.getConteudo().compareTo(atual.getConteudo())< 0) {
			atual.setNoEsquerda(inserir(atual.getNoEsquerda(), novoNo));
		}
		else {
			atual.setNoDireita(inserir(atual.getNoDireita(), novoNo));
		}
		
		return atual;
	}
	
	public void exibirEmOrdem() {
		System.out.println("\n Exibindo em ordem:");
		exibirEmOrdem(this.raiz);
		
	}
	
	private void exibirEmOrdem(NoBinario<T> atual) {
		
		if(atual != null) {
			exibirEmOrdem(atual.getNoEsquerda());
			System.out.print(atual.getConteudo() + ", ");
			exibirEmOrdem(atual.getNoDireita());
		}
	}
	
	public void exibirPosOrdem() {
		System.out.println("\n Exibindo pós ordem:");
		exibirPosOrdem(this.raiz);
		
	}
	
	private void exibirPosOrdem(NoBinario<T> atual) {
		if(atual != null) {
			exibirPosOrdem(atual.getNoEsquerda());
			exibirPosOrdem(atual.getNoDireita());
			System.out.print(atual.getConteudo() + ", ");
			
		}		
	}
	
	public void exibirPreOrdem() {
		System.out.println("\n Exibindo pré ordem:");
		exibirPreOrdem(this.raiz);
	}
	
	private void exibirPreOrdem(NoBinario<T> atual) {
		if(atual != null) {
			System.out.print(atual.getConteudo() + ", ");
			exibirPreOrdem(atual.getNoEsquerda());
			exibirPreOrdem(atual.getNoDireita());
		}
	}
	
	public void remover(T conteudo) {
		try {
			
			NoBinario<T> noAtual = this.raiz;
			NoBinario<T> noPai = null;
			NoBinario<T> noFilho = null;
			NoBinario<T> noTemp = null;
			
			while(noAtual != null && !noAtual.getConteudo().equals(conteudo)) {
				noPai = noAtual;
				
				if(conteudo.compareTo(noAtual.getConteudo()) < 0) {
					noAtual = noAtual.getNoEsquerda();
				}
				else {
					noAtual = noAtual.getNoDireita();
				}
			}
			
			if(noAtual == null) {
				System.out.println("Conteúdo vazio");
			}
			
			if(noPai == null) {
				
				if(noAtual.getNoDireita() == null ) {
					this.raiz = noAtual.getNoEsquerda();					
				}
				else if(noAtual.getNoEsquerda() == null) {
					this.raiz = noAtual.getNoDireita();
					
				}else {
					for(
						noTemp = noAtual, noFilho = noAtual.getNoEsquerda();
						noFilho.getNoDireita() != null;
						noTemp = noFilho, noFilho = noFilho.getNoEsquerda()
						)
					{
						if(noFilho != noAtual.getNoEsquerda()) {
							noTemp.setNoDireita(noFilho.getNoEsquerda());
							noFilho.setNoEsquerda(this.raiz.getNoEsquerda());
						}
					}
					
					noFilho.setNoDireita(this.raiz.getNoDireita());
					this.raiz = noFilho;
					
				}			
				
			}
			else if (noAtual.getNoDireita() == null) {
				
				if(noPai.getNoEsquerda() == noAtual) {
					noPai.setNoEsquerda(noAtual.getNoEsquerda());
				}
				else {
					noPai.setNoDireita(noAtual.getNoEsquerda());
				}
				
			}
			else if(noAtual.getNoEsquerda() == null) {
				
				if(noPai.getNoEsquerda() == noAtual) {
					noPai.setNoEsquerda(noAtual.getNoDireita());
				}
				else {
					noPai.setNoDireita(noAtual.getNoDireita());
				}
				
			}
			else {				
				
				for(
					noTemp = noAtual, noFilho = noAtual.getNoEsquerda();
					noFilho.getNoDireita() != null;
					noTemp = noFilho, noFilho = noFilho.getNoDireita()
					)				
				{
					if(noFilho != noAtual.getNoEsquerda()) {
						noTemp.setNoDireita(noFilho.getNoEsquerda());
						noFilho.setNoEsquerda(noAtual.getNoEsquerda());
					}
					
					noFilho.setNoDireita(noAtual.getNoDireita());
					
					if(noPai.getNoEsquerda() == noAtual) {
						noPai.setNoEsquerda(noFilho);
					}
					else {
						noPai.setNoDireita(noFilho);
					}
					
				}				
			}
			
		}
		catch(NullPointerException ex) {
			System.out.println("Conteúdo vazio: " + ex.getMessage());
		}
	}

}
