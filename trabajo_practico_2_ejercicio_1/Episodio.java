package trabajo_practico_2_ejercicio_1;

public class Episodio {
	String titulo,descripcion;
	boolean episodioVisto;
	int calificacion;
	
	
	public Episodio(String titulo, String descripcion, boolean episodioVisto,int calificacion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.episodioVisto = false;
		this.calificacion = -1;
		
	}
	public void agregarCalificacion(int calificacion) {
		if ((this.episodioVisto == true)&&(calificacion>0 && calificacion <=5)) {
			this.calificacion = calificacion;
		}
		else {
			System.out.println("Calificación erronea.");
		}
	}
	public boolean isEpisodioVisto() {
		return episodioVisto;
	}
	public void setEpisodioVisto() {
		this.episodioVisto =true;
		
	}
	public void setEpisodioVisto(boolean episodioVisto) {
		this.episodioVisto = episodioVisto;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
