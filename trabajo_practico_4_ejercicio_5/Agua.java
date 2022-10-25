package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Agua extends Congelado{
	private String informacion;

	public Agua(Date vencimiento, int nmroLote, Date fechaEnvasado, String granjaOrigen, int codigoEnOrganismo,
			double temperaturaMant, String informacion) {
		super(vencimiento, nmroLote, fechaEnvasado, granjaOrigen, codigoEnOrganismo, temperaturaMant);
		this.informacion = informacion;
	}

	@Override
	public String toString() {
		return "Agua [informacion=" + informacion + "]";
	}
	
}
