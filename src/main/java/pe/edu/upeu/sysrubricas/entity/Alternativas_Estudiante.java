package pe.edu.upeu.sysrubricas.entity;

import java.util.Map;

import pe.edu.upeu.sysrubricas.dao.Alternativas_Estudiante_Dao;

public class Alternativas_Estudiante {
	private int alternativas_est_id;
	private int persona_id;
	private String estado;
	public Alternativas_Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alternativas_Estudiante(int alternativas_est_id, int persona_id, String estado) {
		super();
		this.alternativas_est_id = alternativas_est_id;
		this.persona_id = persona_id;
		this.estado = estado;
	}
	public int getAlternativas_est_id() {
		return alternativas_est_id;
	}
	public void setAlternativas_est_id(int alternativas_est_id) {
		this.alternativas_est_id = alternativas_est_id;
	}
	public int getPersona_id() {
		return persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		
	
	
}
