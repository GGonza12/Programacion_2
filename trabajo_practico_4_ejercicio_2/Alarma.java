package trabajo_practico_4_ejercicio_2;

import java.util.ArrayList;

import trabajo_practico_2_ejercicio_1.Temporada;

public class Alarma {
	private boolean vidrioRoto,puertaOVentanaAbierta,movientoDomicilio;
	private ArrayList<Sensor> sensores;
	public Alarma() {
		this(false,false,false);
	}
	
	public Alarma(boolean vidrioRoto, boolean puertaOVentanaAbierta, boolean movientoDomicilio) {
		this.vidrioRoto = vidrioRoto;
		this.puertaOVentanaAbierta = puertaOVentanaAbierta;
		this.movientoDomicilio = movientoDomicilio;
		this.sensores = new ArrayList<>();
	}
	public void addSensor(Sensor s) {
		this.sensores.add(s);
	}
	
	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	public ArrayList obtenerSensores() {
		return new ArrayList<>(sensores);
	}
	
	public ArrayList detectionSensores() {
		ArrayList<Sensor> copia = new ArrayList<>();
		for(Sensor s : sensores) {
			if(s.isEstado()) {
				copia.add(s);
			}
		}
		if(copia.isEmpty()) {
			copia=null;
		}
	return copia;
	}
	
	public void comprobar(Timbre t) {
		
		if(detectionSensores()!=null) {
			t.hacerSonar();
			System.out.println(detectionSensores());
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
