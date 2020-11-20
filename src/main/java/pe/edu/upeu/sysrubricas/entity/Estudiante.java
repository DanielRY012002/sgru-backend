package pe.edu.upeu.sysrubricas.entity;

public class Estudiante {
	private int persona_id;
	private String codigo_estudiante;
	private String correo_insti;
	public Estudiante() {
		super();
	}
	public Estudiante(int persona_id, String codigo_estudiante, String correo_insti) {
		super();
		this.persona_id = persona_id;
		this.codigo_estudiante = codigo_estudiante;
		this.correo_insti = correo_insti;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public String getCodigo_estudiante() {
		return codigo_estudiante;
	}
	public void setCodigo_estudiante(String codigo_estudiante) {
		this.codigo_estudiante = codigo_estudiante;
	}
	public String getCorreo_insti() {
		return correo_insti;
	}
	public void setCorreo_insti(String correo_insti) {
		this.correo_insti = correo_insti;
	}
	
}
