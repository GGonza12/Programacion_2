package trabajo_practico_1;

import java.time.LocalDate;

public class Testeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona juan = new Persona(42010,"Juan","Carlos",LocalDate.of(1999, 8, 26),"Masculino",23,1.70,70);
		Electrodomestico plancha = new Electrodomestico();
		juan.cumpleAnos();
		juan.getInformacion();
		plancha.comprobarConsumo();
		System.out.println(plancha.calcularBalance());
		System.out.println(plancha.tipoGama());
		//System.out.println(juan.edadCoherente());
	}

}
