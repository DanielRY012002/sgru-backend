package pe.edu.upeu.sysrubricas.entity;

public class Linea_plan {
	private int linea_plan_id;
	private int plan_id;
	private int lineas_pa_id;
	private String estado;
	public Linea_plan() {
		super();
	}
	public Linea_plan(int linea_plan_id, int plan_id, int lineas_pa_id, String estado) {
		super();
		this.linea_plan_id = linea_plan_id;
		this.plan_id = plan_id;
		this.lineas_pa_id = lineas_pa_id;
		this.estado = estado;
	}
	public int getLinea_plan_id() {
		return linea_plan_id;
	}
	public void setLinea_plan_id(int linea_plan_id) {
		this.linea_plan_id = linea_plan_id;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public int getLineas_pa_id() {
		return lineas_pa_id;
	}
	public void setLineas_pa_id(int lineas_pa_id) {
		this.lineas_pa_id = lineas_pa_id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
