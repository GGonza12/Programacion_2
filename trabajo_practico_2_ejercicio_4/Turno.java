package trabajo_practico_2_ejercicio_4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
	private LocalDate fecha;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private Usuario usuario;
	private Cancha cancha;
	public Turno(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Usuario usuario, Cancha cancha) {
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.usuario = usuario;
		this.cancha = cancha;
	}
	/*public Duration getDuracion() {
		return Duration.between(horaInicio, horaFin);
	}*/
	
	
	
	
}
