package trabajo_practico_2_ejercicio_3;

import java.util.ArrayList;

public class Pais {
	private ArrayList <Provincia> provincias; 
	
	public Pais () {
		this.provincias = new ArrayList <Provincia>();
	}
	public void addProvincia(Provincia p) {
		this.provincias.add(p);
	}
	

	public void provinciasConMayorDeficit () {
		for(Provincia p: provincias) {
			if (p.provinciaMasDeficit()) {
				System.out.println(p);
				System.out.println("yep");
			}
			else {
				System.out.println("nop");
			}
		}
	}
}
