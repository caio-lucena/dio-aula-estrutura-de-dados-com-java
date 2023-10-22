package nos.exemplo;

import nos.modelo.No;

public class ExemploNo {

	public static void main(String[] args) {
		
		No<String> no01 = new No<String>("Charmander");
		No<String> no02 = new No<String>("Bulbasaur");
		
		no01.setProximoNo(no02);
		
		System.out.println(no01);
		

	}

}
