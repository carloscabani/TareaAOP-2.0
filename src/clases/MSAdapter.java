package clases;
//Seccion A
public class MSAdapter extends MetricSystem {
	
	public MSAdapter(MetricSystem f) {	
		super(f);
		this.f=f;
	}
	private MetricSystem f;
	
	@Override
	public Double getMesurement() {
		double i= f.getValue();
		if(f.getM().toUpperCase().equals("KM")) {
			i=i*3281;
		}
		if(f.getM().toUpperCase().equals("M")) {
			i=i*3.281;
		}
		if(f.getM().toUpperCase().equals("CM")) {
			i=i/30.38;
		}
		if(f.getM().toUpperCase().equals("MM")) {
			i=i/304.8;
		}
		return i;
	}
	
	public FreedomUnits getConversion() {
		FreedomUnits re= new FreedomUnits(getMesurement(),"FT");
		return re;
	}
	
}
