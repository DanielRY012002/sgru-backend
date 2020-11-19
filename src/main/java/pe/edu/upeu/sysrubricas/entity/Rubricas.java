//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.entity;

public class Rubricas {
	private int rubrica_id;
	private int cl_id;
	private String indicador;
	private int peso;
	private String estado;
	public Rubricas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rubricas(int rubrica_id, int cl_id, String indicador, int peso, String estado) {
		super();
		this.rubrica_id = rubrica_id;
		this.cl_id = cl_id;
		this.indicador = indicador;
		this.peso = peso;
		this.estado = estado;
	}
	public int getRubrica_id() {
		return rubrica_id;
	}
	public void setRubrica_id(int rubrica_id) {
		this.rubrica_id = rubrica_id;
	}
	public int getCl_id() {
		return cl_id;
	}
	public void setCl_id(int cl_id) {
		this.cl_id = cl_id;
	}
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
