package lista.exemplo;

import lista.modelo.ListaEncadeada;

public class ExemploLista {

	public static void main(String[] args) {
		
		ListaEncadeada<String> listaEncadeada = new ListaEncadeada<String>();
		
		listaEncadeada.add("Fluminense");
		listaEncadeada.add("Boca Juniors");
		listaEncadeada.add("São Paulo");
		
		System.out.println(listaEncadeada.get(2));		
		System.out.println(listaEncadeada);

	}

}
