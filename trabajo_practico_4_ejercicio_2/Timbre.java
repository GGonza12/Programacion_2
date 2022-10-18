package trabajo_practico_4_ejercicio_2;

public class Timbre {
	private String mensaje;
	public Timbre(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void hacerSonar() {
		System.out.println(getMensaje());
	}
	public String getMensaje() {
		return this.mensaje;
	}
}
