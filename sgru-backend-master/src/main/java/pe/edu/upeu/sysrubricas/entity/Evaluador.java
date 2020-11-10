package pe.edu.upeu.sysrubricas.entity;

public class Evaluador {

	private int id_Evaluador;
	private int id_Tipo_Evaluador;
	private String Estado;
	public Evaluador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evaluador(int id_Evaluador, int id_Tipo_Evaluador, String estado) {
		super();
		this.id_Evaluador = id_Evaluador;
		this.id_Tipo_Evaluador = id_Tipo_Evaluador;
		this.Estado = estado;
	}
	public int getId_Evaluador() {
		return id_Evaluador;
	}
	public void setId_Evaluador(int id_Evaluador) {
		this.id_Evaluador = id_Evaluador;
	}
	public int getId_Tipo_Evaluador() {
		return id_Tipo_Evaluador;
	}
	public void setId_Tipo_Evaluador(int id_Tipo_Evaluador) {
		this.id_Tipo_Evaluador = id_Tipo_Evaluador;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
