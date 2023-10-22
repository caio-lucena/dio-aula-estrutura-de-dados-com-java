package generics.exemplo;

import java.util.ArrayList;
import java.util.List;

import generics.modelo.Estudante;
import generics.modelo.Impressora;
import generics.modelo.enums.Curso;
import generics.modelo.enums.Turno;

public class ExemploImpressora {

	public static void main(String[] args) {
		
		List<Estudante> sala = new ArrayList<Estudante>();
		Estudante caio = new Estudante("Caio", 33, Curso.ADS, Turno.NOTURNO);
		
		sala.add(caio);
		
		Impressora.imprimirLista(sala);

	}

}
