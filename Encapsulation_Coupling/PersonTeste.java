package Encapsulation_Coupling;

public class PersonTeste {
    public static void main(String[] args) {
        Person personOne = new Person("LUIS", 30);
        Person personTwo = new Person("LAURA", -10);

        System.out.println("-------- PESSOAS DESSE TESTE --------");
        personOne.showInfo();
        personTwo.showInfo();


    }
}
