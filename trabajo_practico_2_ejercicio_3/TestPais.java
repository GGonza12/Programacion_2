package trabajo_practico_2_ejercicio_3;

public class TestPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais argentina = new Pais();
		Provincia marD= new Provincia("Mar del plata");
		Ciudad a = new Ciudad("a", 70,80,90,100,110,9900,100000);
		Ciudad b = new Ciudad("a", 70,80,90,100,110,9900,100000);
		marD.addCiudad(a);
		marD.addCiudad(b);
		argentina.addProvincia(marD);
		argentina.provinciasConMayorDeficit();
	}

}
