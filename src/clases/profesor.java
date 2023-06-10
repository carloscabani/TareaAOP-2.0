package clases;
//Seccion A
public class profesor {
	private String id;
	private String nombre;
	private String aula;
	private int sueldo;
	
	
	public profesor(String id, String nombre, String aula, int sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.aula = aula;
		this.sueldo = sueldo;
	}
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getAula() {
		return aula;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
