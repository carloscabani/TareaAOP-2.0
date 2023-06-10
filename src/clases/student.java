package clases;
//Seccion A
public class student {
	private String id;
	private String name;
	private int nSemestre;
	
	public student(String id, String name, int nSemestre) {
		this.id = id;
		this.name = name;
		this.nSemestre = nSemestre;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getnSemestre() {
		return nSemestre;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setnSemestre(int nSemestre) {
		this.nSemestre = nSemestre;
	}
	
	
}
