package Encapsulation_Coupling;

public class LoggerService {
    private String message;

    LoggerService(String message){
        validateMessage(message);
        this.message = message;
    }

    private void validateMessage(String message){
        if ( message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message not be empty!");
        }
    }

    public void log(){
        System.out.println("Logging message: " + message);
    }
}
