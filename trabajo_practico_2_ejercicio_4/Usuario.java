package trabajo_practico_2_ejercicio_4;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private boolean socio;
	private ArrayList <Turno> turnos;
	
	public Usuario (String nombre) {
		this.nombre = nombre;
		socio = false;
		this.turnos = new ArrayList<Turno>();
	}
	public void addTurno(Turno nuevoTurno) {
		this.turnos.add(nuevoTurno);
		if((turnos.size()>=4)&&(socio==false)) {
			hacerSocio();
		}
	}
	public void hacerSocio() {
		socio =true;
	}
	
}
