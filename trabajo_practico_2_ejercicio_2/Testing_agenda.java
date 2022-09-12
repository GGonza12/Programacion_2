package trabajo_practico_2_ejercicio_2;

public class Testing_agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda profesional = new Agenda();
		Reunion a = new Reunion("temaiken",19.30,21.30);
		Reunion b = new Reunion("temaiken",20.20,22.25);
		Reunion c = new Reunion("temaiken",22.15,22.25);
		profesional.agregarReunion(a);
		profesional.agregarReunion(b);
		profesional.agregarReunion(c);
		profesional.getReuniones();
		
	}

}
