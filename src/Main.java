import animales.Animal;
import animales.Gato;
import animales.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(10,"Oscar");

        System.out.println("El animal es: "+animal.getNombre());

        Animal gatoUno = new Gato(13,"Miaus");
        Animal perroUno = new Perro(5,"Guaus");

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(animal);
        animales.add(gatoUno);
        animales.add(perroUno);

        for (Animal a : animales){
            System.out.println(a.getNombre());
            a.comer(2);
            a.comer();
        }
    }
}