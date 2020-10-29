package pe.edu.upeu.systemasgru.entity;
public class Tipo_Doc {
	private int id_tipo_doc;
	private String nombre;
	private String estado;
	public Tipo_Doc() {
	}
	public Tipo_Doc(int id_tipo_doc, String nombre, String estado) {
		this.id_tipo_doc = id_tipo_doc;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_tipo_doc() {
		return id_tipo_doc;
	}
	public void setId_tipo_doc(int id_tipo_doc) {
		this.id_tipo_doc = id_tipo_doc;
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