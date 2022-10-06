package växthotellet;

public class Kaktus extends Växt {

    public Kaktus(String namn, double längdIMeter) {
        super(namn, längdIMeter);
        setVätska(Vätskor.MINERALVATTEN);
    }

    //Polymorfism
    @Override
    public double beräknaMängdVätska() {
        return 0.02; //Alltid 2 cl
    }
}
