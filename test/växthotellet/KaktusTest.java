package växthotellet;

import org.junit.jupiter.api.Test;

class KaktusTest {

    Kaktus igge = new Kaktus("Igge", 0.20);

    @Test
    void testBeräknaMängdVätska() {
        assert(igge.beräknaMängdVätska()==0.02);
        assert(igge.beräknaMängdVätska()!=0.1); //tvärtom-test
    }
}