package aulas.exemplo;

import aulas.modelo.Ninja;

public class Aula01 {

	public static void main(String[] args) {
		
		Ninja ninjaFolha = new Ninja("Kakashi", "Folha", "Chidori");
		Ninja ninjaAreia = new Ninja("Sasori", "Areia", "Hiruko");
		
		ninjaAreia = ninjaFolha;
		
		System.out.println(ninjaAreia);
		System.out.println(ninjaFolha);

	}
	
	

}
