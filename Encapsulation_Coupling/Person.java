package Encapsulation_Coupling;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        validateName(name);
        validateAge(age);

        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    private void validateName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome vazio ou inválido!");
        }
    }

    private void validateAge(int age){
        if (age < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa! Adicione uma idade válida!");
        }
    }

    public void showInfo(){
        System.out.println("TEMOS UMA PESSOA QUE CHAMA " + getName() + " E QUE TEM " + getAge() + "DE IDADE!");
    }
}
