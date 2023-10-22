package generics.modelo;

import generics.modelo.enums.Curso;
import generics.modelo.enums.Turno;

public class Estudante extends Pessoa{
	
	private Curso curso;
	private Turno turno;
	
	public Estudante(String nome, Integer idade, Curso curso, Turno turno) {
		super(nome, idade);
		this.curso = curso;
		this.turno = turno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	@Override
	public String toString() {
		return "[ nome = "
				+ this.getNome()
				+ ", idade = "
				+ this.getIdade()
				+", curso = "
				+ this.getCurso().getCurso()
				+ ", turno = "
				+ this.getTurno().getTurno()
				+ " ]"; 
	}

}
