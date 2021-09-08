package fel.ejemplos.java;

//Definicion de la clase
class Persona {
    String nombre;
    int edad;
    char genero;

    public Persona(){
    	this("Nombre por defecto", 32, 'f');
        System.out.println("Has creado una persona.");
    }

    public Persona(String nom, int ed, char ge){
        this.nombre = nom;
        this.edad = ed;
        this.genero = ge;
    }

    //Methods
    void jugarVideojuegos(Persona persona){
        System.out.println(nombre + " esta jugando con " +persona.nombre);
    }

    void imprimirInformacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Genero: " +genero);
    }
    public static void main(String[] args) {
        Persona felix = new Persona("Felix", 35, 'm');
        felix.imprimirInformacion();
        System.out.println();
        Persona pepe = new Persona("Pepe", 32, 'm');
        pepe.imprimirInformacion();

        felix.jugarVideojuegos(pepe);
    }
}
