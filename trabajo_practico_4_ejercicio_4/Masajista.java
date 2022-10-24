package trabajo_practico_4_ejercicio_4;

import java.util.Date;

public class Masajista extends Integrante{
	private String titulo;
	private int cantExp;
	
	public Masajista(String nombre, String apellido, int numeroPasaporte, boolean viajando, boolean concentrado,
			boolean paisOrigen, Date fechaNacimiento, String titulo,int cantExp) {
		super(nombre, apellido, numeroPasaporte, viajando, concentrado, paisOrigen, fechaNacimiento);
		this.titulo=titulo;
		this.cantExp=cantExp;
	}
	
	
}
