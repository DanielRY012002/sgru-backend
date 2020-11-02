package pe.edu.upeu.sysrubricas.entity;

public class Reportar_informe {
	private int id_informe;
	private int id_resultados;
	public Reportar_informe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reportar_informe(int id_informe, int id_resultados) {
		super();
		this.id_informe = id_informe;
		this.id_resultados = id_resultados;
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

}
