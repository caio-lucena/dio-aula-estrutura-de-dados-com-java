package lista.dupla.exemplo;

import lista.dupla.modelo.ListaDuplamenteEncadeada;

public class ExemploListaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaListaDupla = new ListaDuplamenteEncadeada<String>();
		
		minhaListaDupla.add("Gojo Satoru");
		minhaListaDupla.add("Geto Suguru");
		minhaListaDupla.add("Nanami Sama");
		
		System.out.println(minhaListaDupla);
		System.out.println("-------------");
		
		minhaListaDupla.remove(2);
		
		System.out.println(minhaListaDupla);
		

	}

}
