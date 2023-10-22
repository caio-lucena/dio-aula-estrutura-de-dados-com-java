package pilha.exemplo;

import pilha.modelo.No;
import pilha.modelo.Pilha;

public class ExemploPilha {

	public static void main(String[] args) {
		
		Pilha minhaPilha = new Pilha();
		
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		
		System.out.println(minhaPilha);
		
		minhaPilha.pop();
		
		System.out.println(minhaPilha);

	}

}
