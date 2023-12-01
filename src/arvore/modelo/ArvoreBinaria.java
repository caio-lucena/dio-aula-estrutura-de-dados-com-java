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
			System.out.println(atual.getConteudo() + ", ");
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
			System.out.println(atual.getConteudo() + ", ");
			
		}		
	}
	
	public void exibirPreOrdem() {
		System.out.println("\n Exibindo pré ordem:");
		exibirPreOrdem(this.raiz);
	}
	
	private void exibirPreOrdem(NoBinario<T> atual) {
		if(atual != null) {
			System.out.println(atual.getConteudo() + ", ");
			exibirPreOrdem(atual.getNoEsquerda());
			exibirPreOrdem(atual.getNoDireita());
		}
	}

}
