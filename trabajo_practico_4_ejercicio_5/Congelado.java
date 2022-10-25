package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Congelado extends Producto{
	private int codigoEnOrganismo;
	private double temperaturaMant;
	public Congelado(Date vencimiento, int nmroLote, Date fechaEnvasado, String granjaOrigen, int codigoEnOrganismo,
			double temperaturaMant) {
		super(vencimiento, nmroLote, fechaEnvasado, granjaOrigen);
		this.codigoEnOrganismo = codigoEnOrganismo;
		this.temperaturaMant = temperaturaMant;
	}
	@Override
	public String toString() {
		return "Congelado [codigoEnOrganismo=" + codigoEnOrganismo + ", temperaturaMant=" + temperaturaMant + "]";
	}
	
	
}
