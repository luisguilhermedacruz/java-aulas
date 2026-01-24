package Herança_Interface;

public class CentralDeNotificacoes {
    private Notificador notificador;

    public CentralDeNotificacoes(Notificador notificador){
        this.notificador = notificador;
    }

    public void enviarNotificacao(){
        notificador.enviar();
    }

    public static void main(String[] args) {
        
        CentralDeNotificacoes email = new CentralDeNotificacoes(new Email());
        email.enviarNotificacao();

        CentralDeNotificacoes SMS = new CentralDeNotificacoes(new SMS());
        SMS.enviarNotificacao();

    }
}
