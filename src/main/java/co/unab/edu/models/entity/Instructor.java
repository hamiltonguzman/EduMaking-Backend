package co.unab.edu.models.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructores")
public class Instructor {
	@Id
	@Column(name = "id_instructor")
	private Integer id;
	
	@Column(name = "nom_instructor")
	private String nombre;
	
	@Column(name = "tel_instructor")
	private Integer telef;	
	
	@Column(name = "email_instructor")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_profesion")
	private Profesion profesion; 
	
	@Column(name = "fecha_ini_experiencia")
	private LocalDate fInicioExp;
	
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	@ManyToOne
	@JoinColumn(name = "id_ciudad")
	private Ciudad ciudad;
	
	@Column(name = "estado_instructor")
	private String estado;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTelef() {
		return telef;
	}

	public void setTelef(Integer telef) {
		this.telef = telef;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public LocalDate getfInicioExp() {
		return fInicioExp;
	}

	public void setfInicioExp(LocalDate fInicioExp) {
		this.fInicioExp = fInicioExp;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", nombre=" + nombre + ", telef=" + telef + ", email=" + email + ", profesion="
				+ profesion + ", fInicioExp=" + fInicioExp + ", pais=" + pais + ", ciudad=" + ciudad + ", estado="
				+ estado + "]";
	}
}
