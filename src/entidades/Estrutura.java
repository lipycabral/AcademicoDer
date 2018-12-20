package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="estruturas")
public class Estrutura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6407863237749366352L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private Curso curso;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private int periodo;
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	public void removerDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}
	public Disciplina getDisciplinaEspecifica(String codigo) {
		for (Disciplina disciplina : disciplinas) {
			if(disciplina.getCodigo().equals(codigo)) {
				return disciplina;
			}
		}
		return null;
	}
	public String toString() {
		return String.format("Curso=(%s), Disciplinas=(%s), Periodo=(%d)", getCurso(), getDisciplinas(), getPeriodo());
	}
}
