package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="professores")
public class Professor {

	@Id
	private long matricula;
	@Column(length=50, nullable=false)
	private String nome;
	@Column(length=11, nullable=false)
	private String rg;
	@Column(length=11, nullable=false)
	private String cpf;
	@Column(length=60, nullable=false)
	private String enderenco;
	@Column(length=13, nullable=false)
	private String fone;
	@OneToOne()
	private Centro centro;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEnderenco() {
		return enderenco;
	}
	public void setEnderenco(String enderenco) {
		this.enderenco = enderenco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Centro getCentro() {
		return centro;
	}
	public void setCentro(Centro centro) {
		this.centro = centro;
	}
	
	public String toString() {
		return String.format("MATRICULA=(%d), NOME=(%s), RG=(%s), CPF=(%s), ENDEREÇO=(%s), TELEFONE=(%s), CENTRO=(%s)", getMatricula(), getNome(), getRg(), getCpf(), getEnderenco(), getFone(), getCentro());
	}
	
}
