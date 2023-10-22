package aulas.modelo;

public class Ninja {
	
	private String nome;
	private String aldeia;
	private String tecnica;
	
	public Ninja(String nome, String aldeia, String tecnica) {
		this.nome = nome;
		this.aldeia = aldeia;
		this.tecnica = tecnica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAldeia() {
		return aldeia;
	}

	public void setAldeia(String aldeia) {
		this.aldeia = aldeia;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	@Override
	public String toString() {
		return "Ninja [nome = " + nome + ", aldeia = "  + aldeia + ", tecnica = " + tecnica + "]";
	}
	
	

}
