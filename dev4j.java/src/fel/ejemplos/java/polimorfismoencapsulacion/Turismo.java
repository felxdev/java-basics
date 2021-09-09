package fel.ejemplos.java.polimorfismoencapsulacion;

public class Turismo extends Automovil implements TransporteReparable {

	@Override
	public void revision() {
		System.out.println("La revision es cada cinco años");
	}
	
	@Override
	public void reparar() {
		System.out.println("reparando un turismo");
	}

	@Override
	public Integer costeReparacion(String marca, Integer precioReparacion) {
		return precioReparacion * getTaxByMarca(marca);
	}

	private Integer getTaxByMarca(String marca) {

		if(marca == "Audi") {
			return 6;
		}else if(marca == "Mercedes") {
			return 7;
		}
		return 0;
	}

}
