package trabajo_practico_4_ejercicio_4;

import java.util.Date;

public class Integrante {
	private String nombre,apellido;
	private int numeroPasaporte;
	private boolean viajando,concentrado,paisOrigen;
	private Date fechaNacimiento;
	
	
	public Integrante(String nombre, String apellido, int numeroPasaporte, boolean viajando, boolean concentrado,
			boolean paisOrigen, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroPasaporte = numeroPasaporte;
		this.viajando = viajando;
		this.concentrado = concentrado;
		this.paisOrigen = paisOrigen;
		this.fechaNacimiento = fechaNacimiento;
	}


	public boolean isViajando() {
		return viajando;
	}


	public boolean isConcentrado() {
		return concentrado;
	}


	public boolean isPaisOrigen() {
		return paisOrigen;
	}
	public boolean isDisponible() {
		return isPaisOrigen() && !isConcentrado();
	}
}
