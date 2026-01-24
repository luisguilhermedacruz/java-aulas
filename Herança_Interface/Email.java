package Herança_Interface;

public class Email implements Notificador {
    @Override
    public void enviar(){
        System.out.println("Uma notificação via e-mail está sendo enviada para o usuário.");
    } 
}
