package trabajo_practico_2_ejercicio_3;

public class Ciudad {
	private String nombre;
	private double imp1,imp2,imp3,imp4,imp5,gastosTotales;
	private int cantPersonas;
	
	



	public Ciudad(String nombre, double imp1, double imp2, double imp3, double imp4, double imp5, int cantPersonas,int gastosTotales) {
		super();
		this.nombre = nombre;
		this.imp1 = imp1;
		this.imp2 = imp2;
		this.imp3 = imp3;
		this.imp4 = imp4;
		this.imp5 = imp5;
		this.cantPersonas = cantPersonas;
		this.gastosTotales = gastosTotales;
	}


	public double getGastosTotales() {
		return gastosTotales;
	}


	public void setGastosTotales(double gastosTotales) {
		this.gastosTotales = gastosTotales;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getImp1() {
		return imp1;
	}


	public void setImp1(double imp1) {
		this.imp1 = imp1;
	}


	public double getImp2() {
		return imp2;
	}

	public void setImp2(double imp2) {
		this.imp2 = imp2;
	}

	public double getImp3() {
		return imp3;
	}
	
	public void setImp3(double imp3) {
		this.imp3 = imp3;
	}

	public double getImp4() {
		return imp4;
	}

	public void setImp4(double imp4) {
		this.imp4 = imp4;
	}

	public double getImp5() {
		return imp5;
	}

	public void setImp5(double imp5) {
		this.imp5 = imp5;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}


	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	
	public double impTotales() {
		return (imp1+imp2+imp3+imp4+imp5);
	}
	
	public boolean gastoMasDeLoRecaudado() {
		System.out.println("0");
		return (getGastosTotales()>impTotales());
	}


	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", imp1=" + imp1 + ", imp2=" + imp2 + ", imp3=" + imp3 + ", imp4=" + imp4
				+ ", imp5=" + imp5 + ", gastosTotales=" + gastosTotales + ", cantPersonas=" + cantPersonas + "]";
	}
	

	
	
}
