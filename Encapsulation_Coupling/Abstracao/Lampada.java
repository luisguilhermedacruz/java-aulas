package Encapsulation_Coupling.Abstracao;

public class Lampada implements Ligavel {
    public void ligar(int voltagem){
        System.out.println("Lâmpada ligada com a voltagem de: " + voltagem + "W");
    }
}
