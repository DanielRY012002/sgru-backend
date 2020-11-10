package pe.edu.upeu.sysrubricas.entity;

public class Estudiante {

	private int id_Persona;
	private String Codigo_Estudiante;
	private String Estado;
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estudiante(int id_Persona, String codigo_Estudiante, String estado) {
		super();
		this.id_Persona = id_Persona;
		this.Codigo_Estudiante = codigo_Estudiante;
		this.Estado = estado;
	}
	public int getId_Persona() {
		return id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	public String getCodigo_Estudiante() {
		return Codigo_Estudiante;
	}
	public void setCodigo_Estudiante(String codigo_Estudiante) {
		Codigo_Estudiante = codigo_Estudiante;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
