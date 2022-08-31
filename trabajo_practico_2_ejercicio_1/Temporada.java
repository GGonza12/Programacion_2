package trabajo_practico_2_ejercicio_1;

import java.util.ArrayList;

public class Temporada {
	private ArrayList <Episodio> episodios;
	
	
	public void agregarTemporada(Episodio ep) {
		this.episodios.add(ep);
		
	}
	public int totalEpisodiosVistos() {
		int cantidad=0;
		for(Episodio e : episodios) {
			if(e.isEpisodioVisto()==true) {
				cantidad++;
			}
		}
		return cantidad;
	}
	public boolean temporadaVista() {
		
		return (totalEpisodiosVistos()==(cantidadEpisodios()));
	}
	public int cantidadEpisodios() {
		return this.episodios.size();
	}
	public double promedioTemporada() {
		double promedio=0;
		int cantidad=0;
		for(Episodio e : episodios) {
			
				cantidad += e.getCalificacion();
			
		}
		promedio = cantidad/this.totalEpisodiosVistos();
		
		return promedio;
	}
	
	
	
}
