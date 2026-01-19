package Encapsulation_Coupling;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        ProductService productService = new ProductService(emailService);

        productService.addProduct("CREATINA!", "guicruz95@hotmail.com");

    }
}
