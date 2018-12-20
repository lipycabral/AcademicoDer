package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="disciplinas")
public class Disciplina implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length=8)
	private String codigo;
	@Column(length=60, nullable=false)
	private String nome;
	@Column(nullable=false)
	private int ch;
	@ManyToOne
	private Centro centro;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public Centro getCentro() {
		return centro;
	}
	public void setCentro(Centro centro) {
		this.centro = centro;
	}
	@Override
	public String toString() {
		return String.format("CODIGO=(%s), NOME=(%s), CARGA HORARIA=(%d),CENTRO=(%s)", getCodigo(), getNome(), getCh(), getCentro());
	}
}
