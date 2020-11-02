package pe.edu.upeu.sysrubricas.entity;

public class Informe {
	private int id_informe;
	private int id_resultados;
	private char estado;

	public Informe() {
		super();
	}

	public Informe(int id_informe, int id_resultados, char estado) {
		super();
		this.id_informe = id_informe;
		this.id_resultados = id_resultados;
		this.estado = estado;
	}

	public int getId_informe() {
		return id_informe;
	}

	public void setId_informe(int id_informe) {
		this.id_informe = id_informe;
	}

	public int getId_resultados() {
		return id_resultados;
	}

	public void setId_resultados(int id_resultados) {
		this.id_resultados = id_resultados;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

}
