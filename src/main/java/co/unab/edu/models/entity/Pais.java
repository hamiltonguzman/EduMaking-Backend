package co.unab.edu.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paises")
public class Pais {
	@Id
	@Column(name = "id_pais")
	private String id;
	
	@Column(name = "nom_pais")
	private String nombre;
	
	@Column(name = "continente_pais")
	private String continente;
	
	@Column(name = "codigo_pais")
	private String codigo;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", continente=" + continente + ", codigo=" + codigo + "]";
	}
}