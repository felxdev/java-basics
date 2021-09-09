package fel.ejemplos.java.polimorfismoencapsulacion;

import java.util.Date;

public abstract class Automovil {

	private Date fechaMatriculacion;
	private Integer numeroDePuertas;
	private String marca;
	private Integer precioReparacion;
	
	public abstract void revision();

	public Date getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public Integer getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(Integer numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getPrecioReparacion() {
		return precioReparacion;
	}

	public void setPrecioReparacion(Integer precioReparacion) {
		this.precioReparacion = precioReparacion;
	}
	
}
