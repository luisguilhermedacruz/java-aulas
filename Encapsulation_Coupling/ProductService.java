package Encapsulation_Coupling;

public class ProductService {
    
    private EmailService emailService;

    public ProductService(EmailService emailService){
        this.emailService = emailService;
    }

    public void addProduct(String productName, String customerEmail){
        System.out.println("Produto cadastrado: " + productName);

        emailService.send(customerEmail, "Seu produto " + productName + " foi cadastrado com sucesso!");
    }

}
