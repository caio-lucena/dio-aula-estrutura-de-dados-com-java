package fila.exemplo;

import fila.modelo.Fila;

public class ExemploFila {

	public static void main(String[] args) {
		Fila<String> minhaFila = new Fila<String>();
		
		minhaFila.enqueue("Primeiro da fila");
		minhaFila.enqueue("Segundo da fila");
		minhaFila.enqueue("Terceiro da fila");
		
		System.out.println(minhaFila);		
		System.out.println(minhaFila.dequeue());
		
		minhaFila.enqueue("Último da fila");
		
		System.out.println(minhaFila);		
		System.out.println(minhaFila.first());

	}

}
