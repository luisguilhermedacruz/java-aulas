package Encapsulation_Coupling.Abstracao;

public class Televisao implements Ligavel {
    public void ligar(int voltagem){
        System.out.println("Televisao ligada com a voltagem de: " + voltagem + "W");
    }
}
