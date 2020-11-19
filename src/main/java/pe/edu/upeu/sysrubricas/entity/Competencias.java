//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.entity;

public class Competencias {
	private int competencias_id;
	private int tipo_competencias_id;
	private String nombre;
	private String descripcion;
	private String estado;
	
	public Competencias() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competencias(int competencias_id, int tipo_competencias_id, String nombre, String descripcion,
			String estado) {
		super();
		this.competencias_id = competencias_id;
		this.tipo_competencias_id = tipo_competencias_id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public int getCompetencias_id() {
		return competencias_id;
	}
	public void setCompetencias_id(int competencias_id) {
		this.competencias_id = competencias_id;
	}
	public int getTipo_competencias_id() {
		return tipo_competencias_id;
	}
	public void setTipo_competencias_id(int tipo_competencias_id) {
		this.tipo_competencias_id = tipo_competencias_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}