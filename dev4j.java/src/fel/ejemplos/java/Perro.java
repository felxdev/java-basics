package fel.ejemplos.java;

public class Perro extends Animal implements Mascota{
	
	private String ownerName;
	private int numeroDePatas; 
	
	public Perro(int numero) {
		super("tana", "Mezcla", "omnivoro");
		this.numeroDePatas = numero;
	}
	
	public Perro(String ownerName) {
		this(3);
		this.ownerName = ownerName;
	}

	@Override
	public void imprimirInformacion() {
		System.out.println("El nombre del perro es: "+this.getNombre());
		System.out.println("El nombre del perro es: "+this.getRaza());
		System.out.println("El nombre del perro es: "+this.getTipoAlimentacion());
		System.out.println("El nombre del perro es: "+this.ownerName);
		System.out.println("El nombre del perro es: "+this.numeroDePatas);
	}
	
	public static void main (String [] args) {
		Mascota tana = new Perro("Felix");
		tana.imprimirInformacion();
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	
	
}
