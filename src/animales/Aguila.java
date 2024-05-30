package animales;

public class Aguila extends Animal implements Actividad{

    public Aguila(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void volar() {
        System.out.println("Aguila Vuela");
    }
}
