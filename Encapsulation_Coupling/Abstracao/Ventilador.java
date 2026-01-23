package Encapsulation_Coupling.Abstracao;

public class Ventilador implements Ligavel {
        public void ligar(int voltagem){
        System.out.println("Ventilador ligado com a voltagem de: " + voltagem + "W");
    }
}
