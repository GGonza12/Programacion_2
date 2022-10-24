package trabajo_practico_4_ejercicio_4;

import java.util.Date;

public class Futbolista extends Integrante{
	private String posicion,patea;
	private int cantGoles;

	public Futbolista(String nombre, String apellido, int numeroPasaporte, boolean viajando, boolean concentrado,
			boolean paisOrigen, Date fechaNacimiento,String posicion,String patea,int cantGoles) {
		super(nombre, apellido, numeroPasaporte, viajando, concentrado, paisOrigen, fechaNacimiento);
		this.posicion= posicion;
		this.patea = patea;
		this.cantGoles =cantGoles;
	}
	
	

}
