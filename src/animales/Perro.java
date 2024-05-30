package animales;

public class Perro extends Animal implements Alimento {
    public Perro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento");
    }

    @Override
    public void masticar() {
        System.out.println("Estoy masticando");

    }


}
