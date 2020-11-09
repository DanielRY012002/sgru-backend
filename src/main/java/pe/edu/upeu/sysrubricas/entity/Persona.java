package pe.edu.upeu.sysrubricas.entity;

public class Persona {
	private int id_persona;
	private String nombres;
	private String apellidos;
	private String sexo;
	private String n_doc;
	private int id_tipo_doc;
	private String estado;

	public Persona() {
		super();
	}

	public Persona(int id_persona, String nombres, String apellidos, String sexo, String n_doc, int id_tipo_doc,
			String estado) {
		super();
		this.id_persona = id_persona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.n_doc = n_doc;
		this.id_tipo_doc = id_tipo_doc;
		this.estado = estado;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getN_doc() {
		return n_doc;
	}

	public void setN_doc(String n_doc) {
		this.n_doc = n_doc;
	}

	public int getId_tipo_doc() {
		return id_tipo_doc;
	}

	public void setId_tipo_doc(int id_tipo_doc) {
		this.id_tipo_doc = id_tipo_doc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
