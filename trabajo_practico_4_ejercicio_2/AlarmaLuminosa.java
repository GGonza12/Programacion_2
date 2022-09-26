package trabajo_practico_4_ejercicio_2;

public class AlarmaLuminosa extends Alarma{
	
	public AlarmaLuminosa(boolean vidrioRoto, boolean puertaOVentanaAbierta, boolean movientoDomicilio) {
		super(vidrioRoto,puertaOVentanaAbierta,movientoDomicilio);
	}
	public void comprobarLuminosa(Timbre t,Luz l) {
		this.comprobar(t);
		l.encender();
	}
	

	
	
}
