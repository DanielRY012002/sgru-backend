package pe.edu.upeu.sysrubricas.entity;

public class Curso {
	private int  curso_id;
	private String nombre;
	private int cr;
	private int ht;
	private int hp;
	private String estado;
	public Curso() {
		super();
	}
	public Curso(int curso_id, String nombre, int cr, int ht, int hp, String estado) {
		super();
		this.curso_id = curso_id;
		this.nombre = nombre;
		this.cr = cr;
		this.ht = ht;
		this.hp = hp;
		this.estado = estado;
	}
	public int getCurso_id() {
		return curso_id;
	}
	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCr() {
		return cr;
	}
	public void setCr(int cr) {
		this.cr = cr;
	}
	public int getHt() {
		return ht;
	}
	public void setHt(int ht) {
		this.ht = ht;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		
}
