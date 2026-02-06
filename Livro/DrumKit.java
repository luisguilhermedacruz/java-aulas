package Livro;

public class DrumKit {
    boolean topHat = true;
    boolean snare = true;
     
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat(){
        System.out.println("ding ding da-dang");
    }

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare = true && d.topHat == true) {
           d.playSnare();
           d.playTopHat(); 
        }
    }
}
