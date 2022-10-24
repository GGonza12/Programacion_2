package trabajo_practico_4_ejercicio_4;

import java.util.Date;

public class Entrenador extends Integrante{
	private int idFederacion;
	
	public Entrenador(String nombre, String apellido, int numeroPasaporte, boolean viajando, boolean concentrado,
			boolean paisOrigen, Date fechaNacimiento,int idFederacion) {
		super(nombre, apellido, numeroPasaporte, viajando, concentrado, paisOrigen, fechaNacimiento);
		this.idFederacion= idFederacion;
	}


	

}
