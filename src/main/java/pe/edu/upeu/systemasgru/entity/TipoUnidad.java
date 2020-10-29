package pe.edu.upeu.systemasgru.entity;

public class TipoUnidad {
	private int id_tipo_unidad;
	private String nombre;
	private String estado;
	public TipoUnidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoUnidad(int id_tipo_unidad, String nombre, String estado) {
		super();
		this.id_tipo_unidad = id_tipo_unidad;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_tipo_unidad() {
		return id_tipo_unidad;
	}
	public void setId_tipo_unidad(int id_tipo_unidad) {
		this.id_tipo_unidad = id_tipo_unidad;
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

/*
 * 
 * 
 */
