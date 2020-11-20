package pe.edu.upeu.sysrubricas.entity;

public class Alternativas {
	private int alternativas_id;
	private int preguntas_id;
	private String correcta_estado;
	public Alternativas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alternativas(int alternativas_id, int preguntas_id, String correcta_estado) {
		super();
		this.alternativas_id = alternativas_id;
		this.preguntas_id = preguntas_id;
		this.correcta_estado = correcta_estado;
	}
	public int getAlternativas_id() {
		return alternativas_id;
	}
	public void setAlternativas_id(int alternativas_id) {
		this.alternativas_id = alternativas_id;
	}
	public int getPreguntas_id() {
		return preguntas_id;
	}
	public void setPreguntas_id(int preguntas_id) {
		this.preguntas_id = preguntas_id;
	}
	public String getCorrecta_estado() {
		return correcta_estado;
	}
	public void setCorrecta_estado(String correcta_estado) {
		this.correcta_estado = correcta_estado;
	}
	
}
