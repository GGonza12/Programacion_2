package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Refrigerado extends Producto{
	private int codigoEnOrganismo;
	private double temperaturaMant;
	public Refrigerado(Date vencimiento, int nmroLote,Date fechaEnvasado, int codigoEnOrganismo,
			double temperaturaMant, String granjaOrigen) {
		super(vencimiento, nmroLote,fechaEnvasado,granjaOrigen);
		this.codigoEnOrganismo = codigoEnOrganismo;
		this.temperaturaMant = temperaturaMant;
	}
	@Override
	public String toString() {
		return "Refrigerado [codigoEnOrganismo=" + codigoEnOrganismo + ", temperaturaMant=" + temperaturaMant + "]";
	}
	
	
	
	
}
