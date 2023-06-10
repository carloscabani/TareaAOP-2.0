package clases;
//Seccion A
public final class singleton {
	
	private static singleton instance;
	public profesor profesor;

	private singleton(profesor profesor) {	
		this.profesor=profesor;
		}
	
	public static singleton getInstance(profesor profesor) {
        if (instance == null) {
            instance = new singleton(profesor);
        }
        return instance;
    }
	
	
	}
