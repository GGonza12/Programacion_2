package trabajo_practico_4_ejercicio_5;

public class testAvicola {

	public static void main(String[] args) {
		
		Avicola avic = new Avicola();
		Fresco p = new Fresco(null,123123,null,"granjaIris");
		Refrigerado r = new Refrigerado(null,77,null,723,88.3,"granjaIris");
		avic.addProduct(p);
		avic.addProduct(r);
		System.out.println(avic);
		
	}

}
