package pe.edu.upeu.sysrubricas.entity;

public class Cronograma {
	private int id_cronograma;
	private String evento;
	private String fecha_ini;
	private String fecha_fin;
	private String estado;
	
	public Cronograma() {
		super();
	}

	public Cronograma(int id_cronograma, String evento, String fecha_ini, String fecha_fin, String estado) {
		super();
		this.id_cronograma = id_cronograma;
		this.evento = evento;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.estado = estado;
	}

	public int getId_cronograma() {
		return id_cronograma;
	}

	public void setId_cronograma(int id_cronograma) {
		this.id_cronograma = id_cronograma;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
