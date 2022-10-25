package trabajo_practico_4_ejercicio_5;

import java.util.ArrayList;

public class Avicola {
	private ArrayList<Producto> productos;

	public Avicola() {
		this.productos = new ArrayList<>();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void addProduct(Producto p){
		this.productos.add(p);
	}

	@Override
	public String toString() {
		return "Avicola [productos=" + productos + "]";
	}
	
	
}
