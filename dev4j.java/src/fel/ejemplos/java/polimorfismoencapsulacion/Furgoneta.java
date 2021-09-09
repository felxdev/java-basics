package fel.ejemplos.java.polimorfismoencapsulacion;

public class Furgoneta extends Automovil implements TransporteReparable{

	@Override
	public void revision() {
		System.out.println("La revision es cada dos años");
	}
	
	@Override
	public void reparar() {
		System.out.println("reparando una furgoneta");
	}

	@Override
	public Integer costeReparacion(String marca, Integer precioReparacion) {
		return precioReparacion * getTaxByMarca(marca);
	}

	private Integer getTaxByMarca(String marca) {

		if(marca == "Audi") {
			return 3;
		}else if(marca == "Mercedes") {
			return 4;
		}
		return 0;
	}

}
