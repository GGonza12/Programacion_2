package trabajo_practico_4_ejercicio_3;

public class TestingEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpleadoHora  eh= new EmpleadoHora(500, 10, 20);
		EmpleadoContratado ec = new EmpleadoContratado(500);
		EmpleadoComision ecms= new EmpleadoComision(500,50,1.15);
		
		System.out.println(eh.getSalario());
		System.out.println(ec.getSalario());
		System.out.println(ecms.getSalario());
	}

}
