package växthotellet;

public enum Vätskor {
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck");

    private final String vätskaNamn;

    Vätskor(String vätskaNamn) {
        this.vätskaNamn = vätskaNamn;
    }

    public String getVätskaNamn() {
        return vätskaNamn;
    }
}
