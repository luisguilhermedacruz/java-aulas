package Herança_Interface;

public class SMS implements Notificador {
    @Override
    public void enviar(){
        System.out.println("Uma notificação via SMS está sendo enviada para o usuário.");
    } 
}
