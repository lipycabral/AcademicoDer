package entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChaveCompostaPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4940654956801386046L;
	private int ano;
	private int semestre;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public String toString() {
		return String.format("ANO=(%d), SEMESTRE=(%d)", getAno(), getSemestre());
	}
}
