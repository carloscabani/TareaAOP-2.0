package clases;
//Seccion A
public class example2 {
	
	public static void main(String[] args) {
		FreedomUnits America= new FreedomUnits(5,"ft");
		FEAdapter AmericatoWorld= new FEAdapter(America);
		MetricSystem RestWorld= AmericatoWorld.getConvertion();
		System.out.println(RestWorld.getMesurement()+""+RestWorld.getM());
		
		MetricSystem World= new MetricSystem(5,"KM");
		MSAdapter WorldtoUSA= new MSAdapter(World);
		FreedomUnits USA= WorldtoUSA.getConversion();
		System.out.println(USA.getMesurement()+""+USA.getM());
	}
}
