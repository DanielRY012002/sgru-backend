package pe.edu.upeu.sysrubricas.entity;

public class Estado_civil {
	private int estado_civil_id;
	private String nombre;
	private String estado;
	public Estado_civil() {
		super();
	}
	public Estado_civil(int estado_civil_id, String nombre, String estado) {
		super();
		this.estado_civil_id = estado_civil_id;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getEstado_civil_id() {
		return estado_civil_id;
	}
	public void setEstado_civil_id(int estado_civil_id) {
		this.estado_civil_id = estado_civil_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
