package pe.edu.upeu.sysrubricas.entity;

public class Tipo_instrumento {
	private int id_tipo_instrumento;
	private String nombre;
	private int estado;
	public Tipo_instrumento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo_instrumento(int id_tipo_instrumento, String nombre, int estado) {
		super();
		this.id_tipo_instrumento = id_tipo_instrumento;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_tipo_instrumento() {
		return id_tipo_instrumento;
	}
	public void setId_tipo_instrumento(int id_tipo_instrumento) {
		this.id_tipo_instrumento = id_tipo_instrumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}

}
