package generics.modelo.enums;

public enum Curso {
	
	ADS ("Análise e Desenvolvimentos de Sistemas"),	
	ADM ("Administração");
	
	private String curso;
	
	private Curso (String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

}
