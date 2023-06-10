package clases;

public aspect AspectAdapter {

	/*se encargara de adaptar los
	dos tipos de donaciones*/
	pointcut ejecucionDonaciones(): execution(void Donacion.procesoDonar());
		
	after() returning: ejecucionDonaciones() {
		
		DonacionEuro euros = (DonacionEuro) new Donar();
		euros.procesoDonarEuro();
		
	}
}
