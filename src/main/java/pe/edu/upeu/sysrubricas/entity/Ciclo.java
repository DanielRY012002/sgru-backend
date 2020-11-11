package pe.edu.upeu.sysrubricas.entity;

public class Ciclo {
	private int id_ciclo;
	private String nombre;
	private String estado;
	
	public Ciclo() {
		super();
	}

	public Ciclo(int id_ciclo, String nombre, String estado) {
		super();
		this.id_ciclo = id_ciclo;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getId_ciclo() {
		return id_ciclo;
	}

	public void setId_ciclo(int id_ciclo) {
		this.id_ciclo = id_ciclo;
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
