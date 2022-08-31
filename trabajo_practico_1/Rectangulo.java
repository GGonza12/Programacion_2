package trabajo_practico_1;

public class Rectangulo {
	String nombre;
	private double lado1,lado2;
	
	public Rectangulo () {
		nombre = "Rectangulo";
		lado1=1;
		lado2=2;
	}
	public Rectangulo (double lado1,double lado2) {
		nombre="Rectangulo";
		this.setLado1(lado1);
		this.setLado2(lado2);
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado1(double lado1) {
		if (lado1>= 0) {
			this.lado1 = lado1;
		}
		else {
			this.lado1 = -lado1;
	       // System.out.println("Era Negativo");
		}
		   
	}
	public void setLado2(double lado2) {
		if (lado2>= 0) {
			this.lado2 = lado2;
		}
		else {
			this.lado2 = -lado2;
	       // System.out.println("Era Negativo");
		}
		   
	}
	public double getArea() {
		return lado1*lado2;
	}
	public double getPerimetro() {
		return lado1*2+lado2*2;
	}
	public int compararRectangulo(Rectangulo rec2) {
		int respuesta = 0;
		if (this.getArea()<rec2.getArea()) {
			respuesta=1;
			}
		else if (this.getArea()==rec2.getArea()) {
			respuesta=0;
		}
		else if (this.getArea()>rec2.getArea()) {
			respuesta=-1;
		}
		return respuesta;
	}
	public boolean comprobarCuadrado() {
		boolean respuesta=false;
		if(lado1==lado2) {
			respuesta=true;
		}
		return respuesta;
	}
	public String acostadoParado() {
		String respuesta = "parado";
		if (lado1>lado2) {
			respuesta = "acostado";
		}
		return respuesta;
	}

	
	
	
	

}
