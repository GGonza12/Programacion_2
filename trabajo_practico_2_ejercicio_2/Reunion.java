package trabajo_practico_2_ejercicio_2;

import java.util.ArrayList;

import trabajo_practico_2_ejercicio_1.Episodio;

public class Reunion {
	private double inicio,fin;
	private String tema;
	private ArrayList <Contacto> contactos;
	public Reunion (String tema, double inicio, double fin) {
		this.contactos = new ArrayList <Contacto>(); 
		this.tema= tema;
		this.inicio = inicio;
		this.fin= fin;
	}
	
	
	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public double getFin() {
		return fin;
	}

	public void setFin(double fin) {
		this.fin = fin;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}


	@Override
	public String toString() {
		return "Reunion [inicio=" + inicio + ", fin=" + fin + " tema=" + tema + ", contactos="
				+ contactos + "]";
	}
	
	
	
}
