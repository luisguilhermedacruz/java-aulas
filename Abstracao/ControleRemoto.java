package Abstracao;

public class ControleRemoto {
    
    public void apertarBotao(Ligavel aparelho, int voltagem){
        aparelho.ligar(voltagem);
    }

    public static void main(String[] args) {
        ControleRemoto botaoControleRemoto = new ControleRemoto();

        Ligavel tv = new Televisao();
        botaoControleRemoto.apertarBotao(tv, 100);

        Ligavel ventilador = new Ventilador();
        botaoControleRemoto.apertarBotao(ventilador, 50);

        Ligavel lampada = new Lampada();
        botaoControleRemoto.apertarBotao(lampada, 5);

    }
}
