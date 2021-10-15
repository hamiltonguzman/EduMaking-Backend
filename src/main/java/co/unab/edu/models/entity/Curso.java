package co.unab.edu.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
	@Id
	@Column(name = "id_curso")
	private String id;
	
	@ManyToOne
	@JoinColumn(name = "id_instructor")
	private Instructor instructor;
	
	@Column(name = "nom_curso")
	private String nombre;
	
	@Column(name = "contenido")
	private String contenido;
	
	@Column(name = "duracion")
	private Integer duracion;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", instructor=" + instructor + ", nombre=" + nombre + ", contenido=" + contenido
				+ ", duracion=" + duracion + "]";
	}
}