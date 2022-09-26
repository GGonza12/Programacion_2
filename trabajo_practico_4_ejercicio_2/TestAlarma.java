package trabajo_practico_4_ejercicio_2;

public class TestAlarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmaLuminosa c = new AlarmaLuminosa(true,false,true);
		Timbre t = new Timbre();
		Luz l = new Luz();
		c.comprobarLuminosa(t, l);
		
	}

}
