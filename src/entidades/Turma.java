package entidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="turmas")
public class Turma {
	@EmbeddedId
	private ChaveCompostaPK chavePk;
	@OneToOne()
	private Curso curso;
	@OneToOne()
	private Disciplina disciplina;
	@OneToOne()
	private Professor professor;
	@Column(nullable=false)
	private int vagas;
	public ChaveCompostaPK getChavePk() {
		return chavePk;
	}
	public void setChavePk(ChaveCompostaPK chavePk) {
		this.chavePk = chavePk;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	@Override
	public String toString() {
		return String.format("ID=(%s), CURSO=(%s), DISCIPLINA=(%s), PROFESSOR=(%s), VAGAS=(%d)", getChavePk(), getCurso(), getDisciplina(), getProfessor(), getVagas());
	}
	

}
