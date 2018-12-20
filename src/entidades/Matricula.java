package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private Curso curso;
	@OneToOne
	private Disciplina disciplina;
	private ChaveCompostaPK chave;
	@OneToOne
	private Aluno aluno;
	@Column(nullable=false)
	private int faltas;
	@Column(precision=2, scale=2)
	private double n1;
	@Column(precision=2, scale=2)
	private double n2;
	@Column(precision=2, scale=2)
	private double nf;
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
	public ChaveCompostaPK getChave() {
		return chave;
	}
	public void setChave(ChaveCompostaPK chave) {
		this.chave = chave;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getNf() {
		return nf;
	}
	public void setNf(double nf) {
		this.nf = nf;
	}
	
	public String toString() {
		return String.format("CURSO=(%s), DISCIPLINA=(%s), (%s), ALUNO=(%s), FALTAS=(%d), N1=(%f), N2=(%f), NF=(%f)", getCurso(), getDisciplina(), getChave(), getAluno(), getFaltas(), getN1(), getN2(), getNf()
				);
	}
}
