package Herança_Interface;

public class ControleRemoto {
    private Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }

    public void apertarBotao(){
        dispositivo.ligar();
    }

    public static void main(String[] args) {
    
    ControleRemoto controleDaTV = new ControleRemoto(new Televisao());
    controleDaTV.apertarBotao();
 
    }
}
