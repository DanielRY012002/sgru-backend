package pe.edu.upeu.sysrubricas.entity;

public class Persona {

	private int id_Persona;
	private String Nombres;
	private String Apellidos;
	private String Sexo;
	private String N_Doc;
	private int id_Tipo_Doc;
	private String Estado;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(int id_Persona, String nombres, String apellidos, String sexo, String n_Doc, int id_Tipo_Doc,
			String estado) {
		super();
		this.id_Persona = id_Persona;
		this.Nombres = nombres;
		this.Apellidos = apellidos;
		this.Sexo = sexo;
		this.N_Doc = n_Doc;
		this.id_Tipo_Doc = id_Tipo_Doc;
		this.Estado = estado;
	}
	public int getId_Persona() {
		return id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getN_Doc() {
		return N_Doc;
	}
	public void setN_Doc(String n_Doc) {
		N_Doc = n_Doc;
	}
	public int getId_Tipo_Doc() {
		return id_Tipo_Doc;
	}
	public void setId_Tipo_Doc(int id_Tipo_Doc) {
		this.id_Tipo_Doc = id_Tipo_Doc;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
