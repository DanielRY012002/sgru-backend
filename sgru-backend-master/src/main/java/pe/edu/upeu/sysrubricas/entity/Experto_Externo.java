package pe.edu.upeu.sysrubricas.entity;

public class Experto_Externo {

	private int id_Persona;
	private String id_Experto_Externo;
	public Experto_Externo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Experto_Externo(int id_Persona, String id_Experto_Externo) {
		super();
		this.id_Persona = id_Persona;
		this.id_Experto_Externo = id_Experto_Externo;
	}
	public int getId_Persona() {
		return id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	public String getId_Experto_Externo() {
		return id_Experto_Externo;
	}
	public void setId_Experto_Externo(String id_Experto_Externo) {
		this.id_Experto_Externo = id_Experto_Externo;
	}
	
	
}
