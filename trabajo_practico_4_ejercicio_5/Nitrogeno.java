package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Nitrogeno extends Congelado{
	private String metodo;
	private int tiempo;
	public Nitrogeno(Date vencimiento, int nmroLote, Date fechaEnvasado, String granjaOrigen, int codigoEnOrganismo,
			double temperaturaMant, String metodo, int tiempo) {
		super(vencimiento, nmroLote, fechaEnvasado, granjaOrigen, codigoEnOrganismo, temperaturaMant);
		this.metodo = metodo;
		this.tiempo = tiempo;
	}
	@Override
	public String toString() {
		return "Nitrogeno [metodo=" + metodo + ", tiempo=" + tiempo + "]";
	}
	
}
