package trabajo_practico_4_ejercicio_2;

public class TestAlarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarma alarm = new Alarma();
		//AlarmaLuminosa c = new AlarmaLuminosa(true,false,true);
		Timbre t = new Timbre("pip-pip-pip");
		t.getMensaje();
		//Luz l = new Luz();
		Sensor bano = new Sensor("Baño", "Ventana de baño",false);
		Sensor entrada = new Sensor("Entrada", "Puerta principal",true);
		Sensor cocina = new Sensor("Cocina", "Ventana de la cocina",true);
		System.out.println((bano.getNombre()));
		alarm.addSensor(bano);
		alarm.addSensor(entrada);
		alarm.addSensor(cocina);
		//System.out.println(alarm.obtenerSensores());
		alarm.comprobar(t);
		
		
	}

}
