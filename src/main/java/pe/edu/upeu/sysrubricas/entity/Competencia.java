//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.entity;

public class Competencia {
	private int id_competencias;
	private String nombre;
	private int id_tipo_instrumento;
	private int id_linea_pa;
	private String estado;
	private String descripcion;
	
	public Competencia(int id_competencias, String nombre, int id_tipo_instrumento, int id_linea_pa, String estado,
			String descripcion) {
		super();
		this.id_competencias = id_competencias;
		this.nombre = nombre;
		this.id_tipo_instrumento = id_tipo_instrumento;
		this.id_linea_pa = id_linea_pa;
		this.estado = estado;
		this.descripcion = descripcion;
	}
	public Competencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_competencias() {
		return id_competencias;
	}
	public void setId_competencias(int id_competencias) {
		this.id_competencias = id_competencias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_tipo_instrumento() {
		return id_tipo_instrumento;
	}
	public void setId_tipo_instrumento(int id_tipo_instrumento) {
		this.id_tipo_instrumento = id_tipo_instrumento;
	}
	public int getId_linea_pa() {
		return id_linea_pa;
	}
	public void setId_linea_pa(int id_linea_pa) {
		this.id_linea_pa = id_linea_pa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}