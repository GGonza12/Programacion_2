package trabajo_practico_4_ejercicio_3;

public class EmpleadoHora extends Empleado{
	private int hora;
	private int salario;
	private int extra;
	
	

	public EmpleadoHora(int salario, int hora, int extra) {
		this.hora = hora;
		this.salario = salario;
		this.extra = extra;
	}



	@Override
	public double getSalario() {
		
		return salario+(hora*extra);
	}
}
