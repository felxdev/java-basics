package fel.ejemplos.java.polimorfismoencapsulacion;

public interface TransporteReparable {
	void reparar();
	Integer costeReparacion(String marca, Integer precioReparacion);
}
