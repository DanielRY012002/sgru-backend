package pe.edu.upeu.sysrubricas.entity;

public class Avance_py {
	private int id_avance_py;
	private int id_cronograma;
	private int id_proyecto;
	private String estado;
	
	public Avance_py() {
		super();
	}

	public Avance_py(int id_avance_py, int id_cronograma, int id_proyecto, String estado) {
		super();
		this.id_avance_py = id_avance_py;
		this.id_cronograma = id_cronograma;
		this.id_proyecto = id_proyecto;
		this.estado = estado;
	}

	public int getId_avance_py() {
		return id_avance_py;
	}

	public void setId_avance_py(int id_avance_py) {
		this.id_avance_py = id_avance_py;
	}

	public int getId_cronograma() {
		return id_cronograma;
	}

	public void setId_cronograma(int id_cronograma) {
		this.id_cronograma = id_cronograma;
	}

	public int getId_proyecto() {
		return id_proyecto;
	}

	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}