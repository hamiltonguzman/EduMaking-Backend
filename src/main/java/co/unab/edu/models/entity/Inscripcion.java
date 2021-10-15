package co.unab.edu.models.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inscripciones")
public class Inscripcion {
	@Id
	@Column(name = "id_inscripcion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInscr;
	
	@ManyToOne
	@JoinColumn(name = "id_curso")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name = "id_persona")
	private Persona persona;
	
	@Column(name = "fecha_ini")
	private LocalDate fechaIni;
	
	@Column(name = "fecha_fin")
	private LocalDate fechaFin;
	
	@Column(name = "certificado")
	private String certificado;
	
	
	public Integer getIdInscr() {
		return idInscr;
	}

	public void setIdInscr(Integer idInscr) {
		this.idInscr = idInscr;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	@Override
	public String toString() {
		return "Inscripcion [idInscr=" + idInscr + ", curso=" + curso + ", persona=" + persona + ", fechaIni="
				+ fechaIni + ", fechaFin=" + fechaFin + ", certificado=" + certificado + "]";
	}
}