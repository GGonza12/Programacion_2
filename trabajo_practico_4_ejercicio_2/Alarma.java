package trabajo_practico_4_ejercicio_2;

public class Alarma {
	private boolean vidrioRoto,puertaOVentanaAbierta,movientoDomicilio;
	
	public Alarma() {
		this(false,false,false);
	}
	
	public Alarma(boolean vidrioRoto, boolean puertaOVentanaAbierta, boolean movientoDomicilio) {
		this.vidrioRoto = vidrioRoto;
		this.puertaOVentanaAbierta = puertaOVentanaAbierta;
		this.movientoDomicilio = movientoDomicilio;
	}
	
	public void comprobar(Timbre t) {
		if(isVidrioRoto()||isPuertaOVentanaAbierta()||isMovientoDomicilio()) {
			t.hacerSonar();
		}
	}
	

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isPuertaOVentanaAbierta() {
		return puertaOVentanaAbierta;
	}

	public void setPuertaOVentanaAbierta(boolean puertaOVentanaAbierta) {
		this.puertaOVentanaAbierta = puertaOVentanaAbierta;
	}

	public boolean isMovientoDomicilio() {
		return movientoDomicilio;
	}

	public void setMovientoDomicilio(boolean movientoDomicilio) {
		this.movientoDomicilio = movientoDomicilio;
	}
	
	
	
}
