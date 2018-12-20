package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
@NamedQueries({
	@NamedQuery(name="CursoTodos", query="SELECT c FROM Curso c ORDER BY c.codigo"),
	@NamedQuery(name="CursoPorNome", query="SELECT c FROM Curso c WHERE c.nome LIKE :nome ORDER BY c.codigo")
})
public class Curso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3976315384769633215L;
	@Id
	private int codigo;
	@Column(length=50, nullable=false)
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return String.format("CODIGO={%d}, NOME={%s}", getCodigo(), getNome());
	}
}
