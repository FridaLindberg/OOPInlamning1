package växthotellet;

import org.junit.jupiter.api.Test;

class KöttätandeVäxtTest {

    KöttätandeVäxt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);

    @Test
    void testBeräknaMängdVätska() {
        assert (meatloaf.beräknaMängdVätska() == 0.24);
        assert (meatloaf.beräknaMängdVätska() != 0.1); //tvärtom-test

    }
}