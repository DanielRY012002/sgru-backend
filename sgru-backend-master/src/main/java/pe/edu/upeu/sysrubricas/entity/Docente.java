package pe.edu.upeu.sysrubricas.entity;

public class Docente {

	private int id_Persona;
	private String Codigo_Docente;
	private String Estado;
	
	public Docente() {
		super();
	}
	public Docente(int id_Persona, String codigo_Docente, String estado) {
		super();
		this.id_Persona = id_Persona;
		this.Codigo_Docente = codigo_Docente;
		this.Estado = estado;
	}
	public int getId_Persona() {
		return id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	public String getCodigo_Docente() {
		return Codigo_Docente;
	}
	public void setCodigo_Docente(String codigo_Docente) {
		Codigo_Docente = codigo_Docente;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
