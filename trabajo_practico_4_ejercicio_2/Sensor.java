package trabajo_practico_4_ejercicio_2;


public class Sensor {
	private String nombre,localizacion;
	private boolean estado;
	
	
	public Sensor(String nombre, String localizacion, boolean estado) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "[lugar=" + nombre + ", localizacion=" + localizacion+  "]";
	}
	
	
}
