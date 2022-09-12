package trabajo_practico_2_ejercicio_2;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import trabajo_practico_2_ejercicio_1.Episodio;

public class Agenda {
	private ArrayList <Reunion> reuniones;
//	private ArrayList <Contacto> contactos;
	private String ubicacion;
	private double duracion,hora;
	
	
	public  Agenda() {
		this.reuniones = new ArrayList <Reunion>();
		
		
		
	}
	public void agregarReunion(Reunion r) {
		if(conflictoHorario(r)) {
			this.reuniones.add(r);
		}
		else {
			System.out.println("Hay conflicto de horario en ");	
		}
	}
	public void getReuniones() {
		for(Reunion s: reuniones) {
			System.out.println(s);
			
		}
	}
	public boolean conflictoHorario(Reunion nuevaReunion) {
		boolean respuesta = true;
		for(Reunion r : reuniones) {
			if((r.getFin()> nuevaReunion.getInicio()) || ( nuevaReunion.getFin()< r.getFin())) {
				respuesta = false;
				
			}
		}
		return respuesta;
		
	}
	
	
	
	
	
	
	
	
	
}
