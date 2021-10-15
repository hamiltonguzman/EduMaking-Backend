package co.unab.edu.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ciudades")
public class Ciudad {
	@Id
	@Column(name = "id_ciudad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Idciudad;
	
	@Column(name = "nom_ciudad")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	@Column(name = "estado_ciudad")
	private String estado;
	

	public Integer getIdciudad() {
		return Idciudad;
	}

	public void setIdciudad(Integer idciudad) {
		Idciudad = idciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Ciudad [Idciudad=" + Idciudad + ", nombre=" + nombre + ", pais=" + pais + ", estado=" + estado + "]";
	}
}




