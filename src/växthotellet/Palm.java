package växthotellet;

public class Palm extends Växt {

    public Palm(String namn, double längd) {
        super(namn, längd);
        setVätska(Vätskor.KRANVATTEN);
    }

    //Polymorfism
    @Override
    public double beräknaMängdVätska() {
        return getLängdIMeter()*0.5;
    }


}
