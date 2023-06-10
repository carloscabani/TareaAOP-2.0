package clases;
//Seccion A
public class MetricSystem {

	private double value;
	private String m;
	
	public MetricSystem(double value, String m) {
		this.value = value;
		this.m = m;
	}
	
	
	public MetricSystem(MetricSystem f) {
	}


	public double getValue() {
		return value;
	}
	public String getM() {
		return m;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public void setM(String m) {
		this.m = m;
	}
	
	public Double getMesurement() {
		double i= getValue();
		if(getM().toUpperCase()=="KM") {
			i=i*1000;
		}
		if(getM().toUpperCase()=="M") {
			i=i*1;
		}
		if(getM().toUpperCase()=="CM") {
			i=i*0.1;
		}
		if(getM().toUpperCase()=="MM") {
			i=i*0.01;
		}
		return i;
	}
	
}
