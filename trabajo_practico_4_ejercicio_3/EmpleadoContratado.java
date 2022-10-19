package trabajo_practico_4_ejercicio_3;

public class EmpleadoContratado extends Empleado{
	private int salario;

	public EmpleadoContratado(int salario) {
		this.salario = salario;
	}

	@Override
	public double getSalario() {
		return salario;
		
	}
	
}
