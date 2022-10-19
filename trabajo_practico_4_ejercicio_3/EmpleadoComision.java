package trabajo_practico_4_ejercicio_3;

public class EmpleadoComision extends Empleado{
	private int sueldoFijo,cantidadVentas;
	private double porcentaje;
	
	public EmpleadoComision(int sueldoFijo, int cantidadVentas, double d) {
		this.sueldoFijo = sueldoFijo;
		this.cantidadVentas = cantidadVentas;
		this.porcentaje = d;
	}

	@Override
	public double getSalario() {
		return sueldoFijo+(cantidadVentas*(porcentaje));
	}
	
}
