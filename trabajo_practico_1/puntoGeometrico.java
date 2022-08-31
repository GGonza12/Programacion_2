package trabajo_practico_1;

public class puntoGeometrico {
	private int x,y;
	//constructores
	public puntoGeometrico(){
		x= 0;
		y=0;
	}
	public puntoGeometrico(int x, int y) {
		this.x= x;
		this.y =y;
	}
	//metodos
	public void desplazarPunto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int distanciaEuclidea(int x2,int y2) {
		int distancia=0;
		distancia = (((this.x-x2)*2)+((this.y-y2)*2));
		Math.sqrt(distancia);
		return distancia;
	}
	
}
