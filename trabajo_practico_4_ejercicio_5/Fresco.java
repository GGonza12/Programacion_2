package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Fresco extends Producto{
	private Date envasado;
	public Fresco(Date vencimiento, int nmroLote,Date fechaEnvasado,String granjaOrigen) {
		super(vencimiento, nmroLote, fechaEnvasado,granjaOrigen);
		
	}
	@Override
	public String toString() {
		return "Fresco [envasado=" + envasado + "]";
	}
	
	
}
