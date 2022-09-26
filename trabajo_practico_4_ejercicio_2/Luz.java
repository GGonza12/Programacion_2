package trabajo_practico_4_ejercicio_2;

public class Luz {
	private boolean encendido;
	public Luz() {
		this.encendido=false;
	}
	public void encender() {
		this.encendido = true;
		System.out.println("Luz ecendida.");
	}
}
