package växthotellet;

import javax.swing.*;

public abstract class Växt implements VäxtInterface {

    //Inkapsling, variablerna är private och använder getters och setters för att nå dem
    private String namn;
    private double längdIMeter;

    private Vätskor vätska;

    public Växt(String namn, double längdIMeter) {
        this.namn = namn;
        this.längdIMeter = längdIMeter;
    }

    @Override
    public void skrivUt() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska få " +
                beräknaMängdVätska() + " liter " + getVätska().getVätskaNamn());
    }

    public Vätskor getVätska() {
        return vätska;
    }

    public void setVätska(Vätskor vätska) {
        this.vätska = vätska;
    }

    public double getLängdIMeter() {
        return längdIMeter;
    }

    public void setLängdIMeter(double längdIMeter) {
        this.längdIMeter = längdIMeter;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
};



