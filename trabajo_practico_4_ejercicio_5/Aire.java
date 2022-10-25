package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Aire extends Congelado{
	private double nitrogeno,oxigeno,dioxidoCarbono,vaporAgua;

	public Aire(Date vencimiento, int nmroLote, Date fechaEnvasado, String granjaOrigen, int codigoEnOrganismo,
			double temperaturaMant, double nitrogeno, double oxigeno, double dioxidoCarbono, double vaporAgua) {
		super(vencimiento, nmroLote, fechaEnvasado, granjaOrigen, codigoEnOrganismo, temperaturaMant);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxidoCarbono = dioxidoCarbono;
		this.vaporAgua = vaporAgua;
	}

	@Override
	public String toString() {
		return "Aire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxidoCarbono=" + dioxidoCarbono
				+ ", vaporAgua=" + vaporAgua + "]";
	}
	
	
	
}
