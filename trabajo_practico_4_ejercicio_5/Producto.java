package trabajo_practico_4_ejercicio_5;

import java.util.Date;

public class Producto {
	private Date vencimiento;
	private int nmroLote;
	private Date fechaEnvasado;
	private String granjaOrigen;
	public Producto(Date vencimiento, int nmroLote,Date fechaEnvasado,String granjaOrigen) {
		this.vencimiento = vencimiento;
		this.nmroLote = nmroLote;
		this.fechaEnvasado= fechaEnvasado;
		this.granjaOrigen= granjaOrigen;
	}
	@Override
	public String toString() {
		return "Producto [vencimiento=" + vencimiento + ", nmroLote=" + nmroLote + ", fechaEnvasado=" + fechaEnvasado
				+ ", granjaOrigen=" + granjaOrigen + "]";
	}
	
	

}
