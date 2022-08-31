package trabajo_practico_2_ejercicio_1;

import java.util.ArrayList;

public class Serie {
	private String titulo,descripcion,creador,genero;
	private ArrayList <Temporada> temporadas;
	
	
	public Serie(String titulo,String descripcion, String creador, String genero) {
		this.titulo= titulo;
		this.descripcion= descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList <Temporada>();
	}
	public void agregarTemporada(Temporada t) {
		this.temporadas.add(t);
		
	}
	public int totalEpisodiosVistosSerie() {
		int cantidad=0;
		for(Temporada t : temporadas) {
				cantidad+= t.totalEpisodiosVistos();
			}
		return cantidad;
	}
	public double promedioSerie() {
		double promedio=0;
		int calif=0;
		
		for(Temporada t : temporadas) {
			
				calif += t.promedioTemporada();
			
		}
		promedio = calif/(cantidadTemporadas());
		
		return promedio;
	}
	public boolean serieVista() {
		int temp=0;
		for (Temporada t : temporadas) {
			if( t.temporadaVista()==true) {
				temp++;
			}
		}
		return temp==cantidadTemporadas();
	}
	public int cantidadTemporadas() {
		return temporadas.size();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	

}
