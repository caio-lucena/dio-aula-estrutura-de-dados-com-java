package lista.circular.exemplo;

import lista.circular.modelo.ListaCircular;

public class ExemploListaCircular {

	public static void main(String[] args) {
		ListaCircular<String> listaCircular = new ListaCircular<String>();		
		
		System.out.println(listaCircular);
		
		listaCircular.add("Sousou no Frieren");
		
		System.out.println(listaCircular);
		
		listaCircular.add("Akudama Drive");
		
		System.out.println(listaCircular);
		
		String anime = listaCircular.get(1);
		
		System.out.println(anime);
		
		listaCircular.remove(1);
		
		System.out.println(listaCircular);

	}

}
