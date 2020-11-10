package pe.edu.upeu.sysrubricas.entity;

public class Tipo_Evaluador {

	private int id_Tipo_Evaluador;
	private String Nombre;
	private int Docente_id_Persona;
	private int Evaluador_Externo_id_Persona;
	private String Estado;
	public Tipo_Evaluador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo_Evaluador(int id_Tipo_Evaluador, String nombre, int docente_id_Persona,
			int evaluador_Externo_id_Persona, String estado) {
		super();
		this.id_Tipo_Evaluador = id_Tipo_Evaluador;
		this.Nombre = nombre;
		this.Docente_id_Persona = docente_id_Persona;
		this.Evaluador_Externo_id_Persona = evaluador_Externo_id_Persona;
		this.Estado = estado;
	}
	public int getId_Tipo_Evaluador() {
		return id_Tipo_Evaluador;
	}
	public void setId_Tipo_Evaluador(int id_Tipo_Evaluador) {
		this.id_Tipo_Evaluador = id_Tipo_Evaluador;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getDocente_id_Persona() {
		return Docente_id_Persona;
	}
	public void setDocente_id_Persona(int docente_id_Persona) {
		Docente_id_Persona = docente_id_Persona;
	}
	public int getEvaluador_Externo_id_Persona() {
		return Evaluador_Externo_id_Persona;
	}
	public void setEvaluador_Externo_id_Persona(int evaluador_Externo_id_Persona) {
		Evaluador_Externo_id_Persona = evaluador_Externo_id_Persona;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
}
