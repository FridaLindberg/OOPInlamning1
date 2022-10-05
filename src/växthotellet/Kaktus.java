package växthotellet;

public class Kaktus extends Växt {

    public Kaktus(String namn, double längd) {
        super(namn, längd);
        setVätska(Vätskor.MINERALVATTEN);
    }

    //Polymorfism
    @Override
    public double beräknaMängdVätska() {
        return 0.02; //Alltid 2 cl
    }
}
