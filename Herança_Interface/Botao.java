package Herança_Interface;

public class Botao{
    private Acao acao;

    public Botao(Acao acao){
        this.acao = acao;
    }

    public void pressionar(){
        acao.executar();
    }
    
    public static void main(String[] args) {
        
        Botao abrindoPortao = new Botao(new AcaoAbrirPorta());
        abrindoPortao.pressionar();

        Botao ligandoLuz = new Botao(new AcaoLigarALuz());
        ligandoLuz.pressionar();

    }

}
