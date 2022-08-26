package trabajo_practico_1;

public class Electrodomestico {
	String nombre,color;
	double consumoEnerg,peso,precioBase;
	
	//Constructores 
	public Electrodomestico() {
		color = "Gris plata.";
		consumoEnerg = 10 ;
		precioBase =  100;
		peso = 2;
		
	}
	public Electrodomestico(String nombre) {
		this(nombre,"Gris plata.");
	}
	public Electrodomestico(String nombre,String color) {
		this(nombre,color,10);
	}
	public Electrodomestico(String nombre,String color, double consumoEnerg) {
		this(nombre,color,consumoEnerg,2);
	}
	public Electrodomestico(String nombre,String color, double consumoEnerg, double peso) {
		this(nombre,color,consumoEnerg,peso,100 );
	}
	public Electrodomestico(String nombre,String color, double consumoEnerg, double peso, double precioBase) {
		this.nombre = nombre;
		this.color = color;
		this.consumoEnerg = consumoEnerg;
		this.peso = peso;
		this.precioBase= precioBase;
	}
	void comprobarConsumo() {
		if (getConsumoEnerg()>45) {
			System.out.println("El consumo es mayor a 45 Kw.");
		}
		else {
			System.out.println("El consumo es menor a 45 Kw.");
		}
	}
	double calcularBalance() {
		return (getPrecioBase()/getPeso());
	}
	String tipoGama() {
		String balance;
		if (calcularBalance()>3) {
			balance= "Gama alta";
		}
		else {
			balance= "Gama baja";
		}
		return balance;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getConsumoEnerg() {
		return consumoEnerg;
	}
	public void setConsumoEnerg(double consumoEnerg) {
		this.consumoEnerg = consumoEnerg;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	
	
	
	
}
