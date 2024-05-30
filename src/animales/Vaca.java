package animales;

public class Vaca extends Animal implements Alimento {

    public Vaca(int edad, String nombre) {
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
