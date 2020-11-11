package pe.edu.upeu.sysrubricas.entity;

public class Docente {
	private int id_persona;
	private String codigo_docente;
	private String estado;
	
	public Docente() {
		super();
	}
	
	public Docente(int id_persona, String codigo_docente, String estado) {
		super();
		this.id_persona = id_persona;
		this.codigo_docente = codigo_docente;
		this.estado = estado;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getCodigo_docente() {
		return codigo_docente;
	}

	public void setCodigo_docente(String codigo_docente) {
		this.codigo_docente = codigo_docente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}


//Creado por: Saul Olivas
