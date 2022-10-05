package växthotellet;

public enum Vätskor {
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck");

    private final String vätskaUtskrift;

    Vätskor(String vätskaUtskrift) {
        this.vätskaUtskrift = vätskaUtskrift;
    }

    public String getVätskaUtskrift() {
        return vätskaUtskrift;
    }
}
