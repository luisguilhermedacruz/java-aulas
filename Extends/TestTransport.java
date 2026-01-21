package Extends;

public class TestTransport {
    public static void main(String[] args) {
        appTransport app = new appTransport();
        aviaoTransport aviao = new aviaoTransport();
        barcoTransport barco = new barcoTransport();
        Transport n4 = new DroneTransport();

        app.transportPeople();
        aviao.transportPeople();
        barco.transportPeople();
        n4.transportPeople();
    }
}
