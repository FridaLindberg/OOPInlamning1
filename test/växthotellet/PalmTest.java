package växthotellet;

import org.junit.jupiter.api.Test;

class PalmTest {

    Palm putte = new Palm("Putte", 1);
    Palm laura = new Palm("Laura", 5);

    @Test
    void testBeräknaMängdVätska() {
        assert(putte.beräknaMängdVätska()==0.5);
        assert(laura.beräknaMängdVätska()==2.5);
        assert(laura.beräknaMängdVätska()!=0.5); //tvärtom-test
    }
}