package pe.edu.upeu.sysrubricas.entity;

public class Nivel_Competencias_Curso {
	private int nivel_competencias_curso_id;
	private int nivel_competencias_id;
	private int plan_curso_id;
	private String estado;
	public Nivel_Competencias_Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nivel_Competencias_Curso(int nivel_competencias_curso_id, int nivel_competencias_id, int plan_curso_id,
			String estado) {
		super();
		this.nivel_competencias_curso_id = nivel_competencias_curso_id;
		this.nivel_competencias_id = nivel_competencias_id;
		this.plan_curso_id = plan_curso_id;
		this.estado = estado;
	}
	public int getNivel_competencias_curso_id() {
		return nivel_competencias_curso_id;
	}
	public void setNivel_competencias_curso_id(int nivel_competencias_curso_id) {
		this.nivel_competencias_curso_id = nivel_competencias_curso_id;
	}
	public int getNivel_competencias_id() {
		return nivel_competencias_id;
	}
	public void setNivel_competencias_id(int nivel_competencias_id) {
		this.nivel_competencias_id = nivel_competencias_id;
	}
	public int getPlan_curso_id() {
		return plan_curso_id;
	}
	public void setPlan_curso_id(int plan_curso_id) {
		this.plan_curso_id = plan_curso_id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
