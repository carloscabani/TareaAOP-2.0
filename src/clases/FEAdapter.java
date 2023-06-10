package clases;
//Seccion A
public class FEAdapter extends FreedomUnits{
	
	public FEAdapter(FreedomUnits f) {	
		super(f);
		this.f=f;
		
	}
	private FreedomUnits f;
	
	@Override
	public Double getMesurement() {
		double i= f.getValue();
		if(f.getM().toUpperCase().equals("MI")) {
			i=i*1609;
		}
		if(f.getM().toUpperCase().equals("YD")) {
			i=i*0.9144;
		}
		if(f.getM().toUpperCase().equals("FT")) {
			i=i*0.3048;
		}
		if(f.getM().toUpperCase().equals("IN")) {
			i=i*0.0254;
		}
		return i;
	}
	public MetricSystem getConvertion() {
		MetricSystem re= new MetricSystem(getMesurement(),"M");
		return re;
	}
}
