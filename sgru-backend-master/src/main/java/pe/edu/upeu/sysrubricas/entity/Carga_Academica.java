package pe.edu.upeu.sysrubricas.entity;

public class Carga_Academica {

	private int id_Programa_Academico;
	private String Codigo_Docente;
	private int id_Plan_Ciclo_Curso;
	private int Docente_id_Persona;
	private String Estado;
	
	public Carga_Academica() {
		super();
	}
	public Carga_Academica(int id_Programa_Academico, String codigo_Docente, int id_Plan_Ciclo_Curso,
			int docente_id_Persona, String estado) {
		super();
		this.id_Programa_Academico = id_Programa_Academico;
		this.Codigo_Docente = codigo_Docente;
		this.id_Plan_Ciclo_Curso = id_Plan_Ciclo_Curso;
		this.Docente_id_Persona = docente_id_Persona;
		this.Estado = estado;
	}
	public int getId_Programa_Academico() {
		return id_Programa_Academico;
	}
	public void setId_Programa_Academico(int id_Programa_Academico) {
		this.id_Programa_Academico = id_Programa_Academico;
	}
	public String getCodigo_Docente() {
		return Codigo_Docente;
	}
	public void setCodigo_Docente(String codigo_Docente) {
		Codigo_Docente = codigo_Docente;
	}
	public int getId_Plan_Ciclo_Curso() {
		return id_Plan_Ciclo_Curso;
	}
	public void setId_Plan_Ciclo_Curso(int id_Plan_Ciclo_Curso) {
		this.id_Plan_Ciclo_Curso = id_Plan_Ciclo_Curso;
	}
	public int getDocente_id_Persona() {
		return Docente_id_Persona;
	}
	public void setDocente_id_Persona(int docente_id_Persona) {
		Docente_id_Persona = docente_id_Persona;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
