package arvore.exemplo;

import arvore.modelo.ArvoreBinaria;
import arvore.modelo.objetos.implemetacao.ObjetoArvoreImplementacao;

public class ExemploArvoreBinaria {

	public static void main(String[] args) {
		ArvoreBinaria<ObjetoArvoreImplementacao> minhaArvore = new ArvoreBinaria<>();
		
		minhaArvore.inserir(new ObjetoArvoreImplementacao(13));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(10));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(2));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(12));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(25));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(20));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(31));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(29));
		minhaArvore.inserir(new ObjetoArvoreImplementacao(32));
		
		minhaArvore.exibirEmOrdem();
		minhaArvore.exibirPreOrdem();
		minhaArvore.exibirPosOrdem();

	}

}
