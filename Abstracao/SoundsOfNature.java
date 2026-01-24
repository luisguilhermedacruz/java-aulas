package Abstracao;

public class SoundsOfNature {
    public void starSound(Animal animal, String typeOfSound){
        animal.makesASound(typeOfSound);
    }

    public static void main(String[] args) {
        SoundsOfNature sonsAnimais = new SoundsOfNature();

        Animal gato = new Cat();
        sonsAnimais.starSound(gato, "MIA");

        Animal cachoroo = new Dog ();
        sonsAnimais.starSound(cachoroo, "LATE");

        Animal vaca = new Cow();
        sonsAnimais.starSound(vaca, "MUGI");

    }
}
