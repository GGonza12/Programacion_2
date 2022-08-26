package trabajo_practico_1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	//Atributos.
	private	String nombre,apellido,sexo;
	private int edad;
	private LocalDate fnac;
	private long dni;
	private double peso, altura;
	private static double minimoMasa = 18.5;
	private static double maxMasa = 25;
	private static double edadMayor = 18;
	private static double edadVotar = 16;
	//Constructores.
	public Persona(int dni) {
		this(dni,"N");
	}
	public Persona(long dni, String nombre) {
		this(dni,nombre,"N");
	}
	public Persona(long dni, String nombre, String apellido) {
		this(dni,nombre,apellido,LocalDate.of(2001, 1, 1));
	}
	public Persona(long dni, String nombre, String apellido, LocalDate fnac) {
		this(dni,nombre,apellido,fnac,"Femenino");
	}
	public Persona(long dni, String nombre, String apellido,  LocalDate fnac, String sexo) {
		this(dni,nombre,apellido,fnac,sexo,22);
	}
	public Persona(long dni, String nombre, String apellido,  LocalDate fnac, String sexo, int edad) {
		this(dni,nombre,apellido,fnac,sexo,edad,1,1);
	}
	public Persona(long dni, String nombre, String apellido,  LocalDate fnac, String sexo, int edad, double altura) {
		this(dni,nombre,apellido,fnac,sexo,edad,altura,1);
	}
	public Persona(long dni, String nombre, String apellido,  LocalDate fnac, String sexo, int edad, double altura, double peso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fnac = fnac;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	//metodos.
		
		 double getIndice() { //inidice de masa corporal.
			double masaCorporal = (getPeso()/(getAltura()*getAltura()));
			return masaCorporal;
		}
		 String estaEnForma() { //para saber si esta en forma o no.
			double masaCorporal = getIndice();
			String respuesta;
			if ((masaCorporal>=minimoMasa)&&(masaCorporal<=maxMasa)) {
				respuesta= "Esta en forma";
			}
			else {
				respuesta= "No esta en forma";
			}
			return respuesta;
		}
		 boolean edadCoherente() {
			LocalDate localDate1 = LocalDate.now();
			Period period = Period.between(fnac, localDate1);
			System.out.println(period.getYears());
			return (period.getYears()==(edad));
		}
		 void cumpleAnos() {
			LocalDate localDate1 = LocalDate.now();
			if((localDate1.getDayOfMonth()==fnac.getDayOfMonth())&&(localDate1.getMonth().equals(fnac.getMonth()))) {
				System.out.println("Feliz Cumpleaños");
			}
			else {
				System.out.println("nop");
			}
			
		}
		 void getInformacion() {
			System.out.println("Nombre: "+this.getNombre() + " "+ this.getApellido() + "- Sexo: " +this.getSexo() + " - Dni:"+ this.getDni() +"- Edad: "+ this.getEdad());
			System.out.println("Altura: " + this.getAltura()+ " - Peso: "+ this.getPeso() + " - Indice: " + this.getIndice() + " - " + this.estaEnForma());
			
		}
		
		
		boolean mayorEdad(int edad) { //saber si es mayor de edad.
			return (edad>=edadMayor);
		}
		boolean poderVotar(int edad) { //saber si puede votar.
			return (edad>=edadVotar);
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public LocalDate getFnac() {
			return fnac;
		}
		public void setFnac(LocalDate fnac) {
			this.fnac = fnac;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public long getDni() {
			return dni;
		}
		
		
		
	
	
	

}
