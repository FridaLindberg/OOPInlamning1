package växthotellet;

public class KöttätandeVäxt extends Växt {

    public KöttätandeVäxt(String namn, double längdIMeter) {
        super(namn, längdIMeter);
        setVätska(Vätskor.PROTEINDRYCK);
    }

    //Polymorfism
    @Override
    public double beräknaMängdVätska() {
        return 0.1 + (0.2 * getLängdIMeter());
    }
}
