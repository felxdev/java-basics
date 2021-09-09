package fel.ejemplos.java.polimorfismoencapsulacion;

public class PruebaTransporteReparable {

	public void repararAutomovil(TransporteReparable tr) {
		tr.reparar();
	}
	
	public static void main(String[] args) {
		PruebaTransporteReparable ptr = new PruebaTransporteReparable();
		ptr.repararAutomovil(new Turismo());
		ptr.repararAutomovil(new Furgoneta());
	}
}
