package pe.edu.upeu.sysrubricas.entity;

public class Lineas_pa {
	private int idlineas_pa;
	private String nombre;
	private String estado;
	
	public Lineas_pa() {
		super();
	}

	public Lineas_pa(int idlineas_pa, String nombre, String estado) {
		super();
		this.idlineas_pa = idlineas_pa;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getIdlineas_pa() {
		return idlineas_pa;
	}

	public void setIdlineas_pa(int idlineas_pa) {
		this.idlineas_pa = idlineas_pa;
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
