package generics.modelo;

import java.util.List;

public class Impressora {
	
	public static void imprimirLista(List<?> lista) {
		for(Object list: lista) {
			System.out.println(list);
		}
	}


}
