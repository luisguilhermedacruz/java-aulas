package Abstracao;

public class Dog implements Animal {
    @Override
    public void makesASound(String typeOfSound){
        System.out.println("O cachorro " + typeOfSound);
    }
}
