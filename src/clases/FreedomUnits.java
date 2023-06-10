package clases;
//Seccion A
public class FreedomUnits {
	private double value;
	private String m;
	
	public FreedomUnits(double value, String m) {
		this.value = value;
		this.m = m;
	}

	
	public FreedomUnits(FreedomUnits f) {
	}

	public double getValue() {
		return value;
	}
	public String getM() {
		return m;
	}
	
	public Double getMesurement() {
		double i= getValue();
		if(getM().toUpperCase()=="MI") {
			i=i*5280;
		}
		if(getM().toUpperCase()=="YD") {
			i=i*3;
		}
		if(getM().toUpperCase()=="FT") {
			i=i*1;
		}
		if(getM().toUpperCase()=="IN") {
			i=i/12;
		}
		return i;
	}
	
}
