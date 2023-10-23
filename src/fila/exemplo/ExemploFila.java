package fila.exemplo;

import fila.modelo.Fila;
import fila.modelo.No;

public class ExemploFila {

	public static void main(String[] args) {
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("Primeiro da fila"));
		minhaFila.enqueue(new No("Segundo da fila"));
		
		System.out.println(minhaFila);

	}

}
