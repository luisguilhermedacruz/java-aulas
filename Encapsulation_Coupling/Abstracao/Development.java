package Encapsulation_Coupling.Abstracao;

public class Development {
    public void startDevelopment(Human typeMovimentHuman, int velocity){
        typeMovimentHuman.movement(velocity);
    }

    public static void main(String[] args) {
        Development developmentHuman = new Development();

        Human caminhar = new Walk();
        developmentHuman.startDevelopment(caminhar, 10);
       
        Human correr = new Run();
        developmentHuman.startDevelopment(correr, 60);

        Human rastejar = new Crawl();
        developmentHuman.startDevelopment(rastejar, 6);

    }
}
