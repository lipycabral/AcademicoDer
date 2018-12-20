package entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="alunos")
@NamedQueries({
	@NamedQuery(name="AlunosTodos", query="SELECT a FROM Aluno a ORDER BY a.matricula")
})
public class Aluno {
	@Id
	private long matricula;
	@Column(length=100, nullable=false)
	private String nome;
	@Column(length=100, nullable=false)
	private String fone;
	@Column(length=100, nullable=false)
	private String endereco;
	@Column(length=100, nullable=false)
	private String cep;
	@Column(length=100, nullable=false)
	private String sexo;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Curso curso;
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return String.format("MATRICULA={%d}, NOME={%s}, FONE={%s}, ENDEREÇO={%s}, CEP={%s}, SEXO={%s}, CURSO={%s}", getMatricula(), getNome(), getFone(), getEndereco(), getCep(), getSexo(), getCurso());
	}
}
