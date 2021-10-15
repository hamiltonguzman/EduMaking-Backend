package co.unab.edu.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona {
	@Id
	@Column(name = "id_persona")
	private Integer idPersona;
	
	@Column(name = "tip_doc")
	private String tipoDoc;
	
	@Column(name = "nom_Empresa")
	private String nombreEmpresa;
	
	@Column(name = "tel_empresa")
	private Integer telEmpresa;
	
	@Column(name = "email_empresa")
	private String emailEmpresa;
	
	@Column(name = "nom_persona")
	private String nombrePersona;
	
	@Column(name = "tel_persona")
	private Integer telPersona;
	
	@Column(name = "email_persona")
	private String emailPersona;
	
	@Column(name = "cargo_persona")
	private String cargoPersona;
	
	@ManyToOne
	@JoinColumn(name = "id_profesion")
	private Profesion profesion;
	
	@Column(name = "clasificacion")
	private String clasif;
	
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	@ManyToOne
	@JoinColumn(name = "id_ciudad")
	private Ciudad ciudad;
	
	@Column(name = "rut_persona")
	private String rutPersona;
	
	@Column(name = "Interes")
	private  String interes;
	
	@Column(name = "estado_persona")
	private String estado;
	

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Integer getTelEmpresa() {
		return telEmpresa;
	}

	public void setTelEmpresa(Integer telEmpresa) {
		this.telEmpresa = telEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Integer getTelPersona() {
		return telPersona;
	}

	public void setTelPersona(Integer telPersona) {
		this.telPersona = telPersona;
	}

	public String getEmailPersona() {
		return emailPersona;
	}

	public void setEmailPersona(String emailPersona) {
		this.emailPersona = emailPersona;
	}

	public String getCargoPersona() {
		return cargoPersona;
	}

	public void setCargoPersona(String cargoPersona) {
		this.cargoPersona = cargoPersona;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public String getClasif() {
		return clasif;
	}

	public void setClasif(String clasif) {
		this.clasif = clasif;
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

	public String getRutPersona() {
		return rutPersona;
	}

	public void setRutPersona(String rutPersona) {
		this.rutPersona = rutPersona;
	}

	public String getInteres() {
		return interes;
	}

	public void setInteres(String interes) {
		this.interes = interes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", tipoDoc=" + tipoDoc + ", nombreEmpresa=" + nombreEmpresa
				+ ", telEmpresa=" + telEmpresa + ", emailEmpresa=" + emailEmpresa + ", nombrePersona=" + nombrePersona
				+ ", telPersona=" + telPersona + ", emailPersona=" + emailPersona + ", cargoPersona=" + cargoPersona
				+ ", profesion=" + profesion + ", clasif=" + clasif + ", pais=" + pais + ", ciudad=" + ciudad
				+ ", rutPersona=" + rutPersona + ", interes=" + interes + ", estado=" + estado + "]";
	}
}