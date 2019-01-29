package no.hvl.dat109.tests;

import no.hvl.dat109.Terning;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TerningTest {

    private final int ANTALL_KAST = 1000;

    @Test
    public void trillGirGyldigDyr() {
        Terning terning = new Terning();
        List<Terning.Dyr> dyr = Arrays.asList(Terning.Dyr.values());

        for (int i = 0; i < ANTALL_KAST; i++) {
            terning.trill();
            dyr.contains(terning.getCurrentDyr());
        }
    }
}
