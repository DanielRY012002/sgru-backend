package pe.edu.upeu.sysrubricas.entity;

public class Evaluador_Externo {

	private int id_Persona;
	private int id_Evaluador_Externo;
	private String Especialidad;
	public Evaluador_Externo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evaluador_Externo(int id_Persona, int id_Evaluador_Externo, String especialidad) {
		super();
		this.id_Persona = id_Persona;
		this.id_Evaluador_Externo = id_Evaluador_Externo;
		this.Especialidad = especialidad;
	}
	public int getId_Persona() {
		return id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	public int getId_Evaluador_Externo() {
		return id_Evaluador_Externo;
	}
	public void setId_Evaluador_Externo(int id_Evaluador_Externo) {
		this.id_Evaluador_Externo = id_Evaluador_Externo;
	}
	public String getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
	
}
