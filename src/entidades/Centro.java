package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="centros")
public class Centro {
	@Id
	@Column(length=5)
	private String sigla;
	@Column(length=60, nullable=false)
	private String nome;
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return String.format("SIGLA={%s}, NOME={%s}", getSigla(), getNome());
	}
}
