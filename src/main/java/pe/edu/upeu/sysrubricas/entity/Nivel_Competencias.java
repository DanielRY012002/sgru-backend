package pe.edu.upeu.sysrubricas.entity;

public class Nivel_Competencias {
	private int nivel_competencias_id;
	private int competencias_id;
	private int utils_id;
	private String estado;
	public Nivel_Competencias() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nivel_Competencias(int nivel_competencias_id, int competencias_id, int utils_id, String estado) {
		super();
		this.nivel_competencias_id = nivel_competencias_id;
		this.competencias_id = competencias_id;
		this.utils_id = utils_id;
		this.estado = estado;
	}
	public int getNivel_competencias_id() {
		return nivel_competencias_id;
	}
	public void setNivel_competencias_id(int nivel_competencias_id) {
		this.nivel_competencias_id = nivel_competencias_id;
	}
	public int getCompetencias_id() {
		return competencias_id;
	}
	public void setCompetencias_id(int competencias_id) {
		this.competencias_id = competencias_id;
	}
	public int getUtils_id() {
		return utils_id;
	}
	public void setUtils_id(int utils_id) {
		this.utils_id = utils_id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
