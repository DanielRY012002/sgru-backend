package pe.edu.upeu.sysrubricas.entity;

public class Nivel_Logro {

	private int id_Nivel_Logro;
	private String Nombre;
	private String Estado;
	
	public Nivel_Logro() {
		super();
			}
	public Nivel_Logro(int id_Nivel_Logro, String nombre, String estado) {
		super();
		this.id_Nivel_Logro = id_Nivel_Logro;
		this.Nombre = nombre;
		this.Estado = estado;
	}
	public int getId_Nivel_Logro() {
		return id_Nivel_Logro;
	}
	public void setId_Nivel_Logro(int id_Nivel_Logro) {
		this.id_Nivel_Logro = id_Nivel_Logro;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
