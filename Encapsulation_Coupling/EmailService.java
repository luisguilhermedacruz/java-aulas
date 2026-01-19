package Encapsulation_Coupling;

public class EmailService {
    
    public void send(String email, String message){
        System.out.println("ENVIANDO EMAIL PARA: " + email);
        System.out.println("MENSAGEM: " + message);
    }
}   
