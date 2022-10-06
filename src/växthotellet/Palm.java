package växthotellet;

public class Palm extends Växt {

    public Palm(String namn, double längdIMeter) {
        super(namn, längdIMeter);
        setVätska(Vätskor.KRANVATTEN);
    }

    //Polymorfism
    @Override
    public double beräknaMängdVätska() {
        return getLängdIMeter() * 0.5;
    }


}
