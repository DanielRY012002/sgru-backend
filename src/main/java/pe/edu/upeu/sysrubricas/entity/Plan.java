package pe.edu.upeu.sysrubricas.entity;

public class Plan {
	private int plan_id;
	private int ua_id;
	private String nombre;
	private String f_ini;
	private String f_fin;
	private String estado;
	public Plan() {
		super();
	}
	public Plan(int plan_id, int ua_id, String nombre, String f_ini, String f_fin, String estado) {
		super();
		this.plan_id = plan_id;
		this.ua_id = ua_id;
		this.nombre = nombre;
		this.f_ini = f_ini;
		this.f_fin = f_fin;
		this.estado = estado;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public int getUa_id() {
		return ua_id;
	}
	public void setUa_id(int ua_id) {
		this.ua_id = ua_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getF_ini() {
		return f_ini;
	}
	public void setF_ini(String f_ini) {
		this.f_ini = f_ini;
	}
	public String getF_fin() {
		return f_fin;
	}
	public void setF_fin(String f_fin) {
		this.f_fin = f_fin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
