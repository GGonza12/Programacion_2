package trabajo_practico_2_ejercicio_3;

import java.util.ArrayList;

public class Provincia {
	private ArrayList <Ciudad> ciudades;
	private String nombre;
	private int maxHabitantes =100000;
	
	public Provincia (String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudad>();
	}
	public void addCiudad(Ciudad nuevaCiudad) {
				this.ciudades.add(nuevaCiudad);	
	}
//	public void addCiudadMaxHabitantes(Ciudad nuevaCiudad) {
//		for(Ciudad ciudad: ciudades) {
//			if(ciudad.getCantPersonas()>maxHabitantes) {
//				this.addCiudad(nuevaCiudad);	
//			}
//	}
		
	public void ciudadSuperoLoReacaudado() {
		for (Ciudad c: ciudades) {
			if (c.gastoMasDeLoRecaudado()) {
				System.out.println(c);
			}
		}
	}
	public int cantidadCiudadesDeficit() {
		int contador = 0;
		for (Ciudad c: ciudades) {
			if (c.gastoMasDeLoRecaudado()) {
				System.out.println("a");
				contador ++;
			}
		}
		return contador;
		
	}
	public boolean provinciaMasDeficit() {
		return (this.cantidadCiudadesDeficit()>((ciudades.size()/2)));
	}
	@Override
	public String toString() {
		return "Provincia [ciudades=" + ciudades + ", nombre=" + nombre + ", maxHabitantes=" + maxHabitantes + "]";
	}
	
	
	
	
	
	}
	
	
	

