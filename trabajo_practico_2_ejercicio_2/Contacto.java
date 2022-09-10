package trabajo_practico_2_ejercicio_2;

public class Contacto {
	private String nombre,mail;
	private int telefono;
	
	public Contacto() {
		this("Juan","juanito97@gmail.com",2494979);
	}
	public Contacto(String nombre, String mail, int telefono) {
		this.nombre = nombre;
		this.mail = mail;
		this.telefono= telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
