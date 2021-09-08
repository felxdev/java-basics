package fel.ejemplos.java;

public class Animal {

	private String nombre;
	private String raza;
	private String tipoAlimentacion;
	
	public Animal() {}
	
	public Animal(String raza, String tipoAlimentacion) {
		this.raza = raza;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public Animal(String nombre, String raza, String tipoAlimentacion) {
		this.nombre = nombre;
		this.raza = raza;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	
}
