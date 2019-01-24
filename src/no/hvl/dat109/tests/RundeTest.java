package no.hvl.dat109.tests;

import no.hvl.dat109.*;
import org.junit.Test;

public class RundeTest {

    @Test
    public void DyrRundeTest() {
        Runde dyrRunde = new DyrRunde(Terning.Dyr.LØVE);

        for (Terning terning : dyrRunde.getTerninger()) {
            terning.setCurrentDyr(Terning.Dyr.LØVE);
        }

        assert (dyrRunde.poeng() == 5);

        dyrRunde.getTerninger().get(0).setCurrentDyr(Terning.Dyr.SLANGE);

        assert (dyrRunde.poeng() == 4);

        for (Terning terning : dyrRunde.getTerninger()) {
            terning.setCurrentDyr(Terning.Dyr.PANDA);
        }

        assert (dyrRunde.poeng() == 0);
    }

    @Test
    public void YatzooRundeTest() {
        Runde yatzooRunde = new YatzooRunde();

        for (Terning terning : yatzooRunde.getTerninger()) {
            terning.setCurrentDyr(Terning.Dyr.LØVE);
        }

        assert (yatzooRunde.poeng() == 10);

        yatzooRunde.getTerninger().get(0).setCurrentDyr(Terning.Dyr.SLANGE);

        assert (yatzooRunde.poeng() == 0);
    }

    @Test
    public void NLikeRundeTest() {
        Runde treLike = new NLikeRunde(3);

        for (Terning terning : treLike.getTerninger()) {
            terning.setCurrentDyr(Terning.Dyr.LØVE);
        }

        assert (treLike.poeng() == 3);

        treLike.getTerninger().get(0).setCurrentDyr(Terning.Dyr.SLANGE);
        treLike.getTerninger().get(1).setCurrentDyr(Terning.Dyr.PANDA);

        assert (treLike.poeng() == 3);

        treLike.getTerninger().get(2).setCurrentDyr(Terning.Dyr.PANDA);

        assert (treLike.poeng() == 0);

        Runde fireLike = new NLikeRunde(4);

        for (Terning terning : fireLike.getTerninger()) {
            terning.setCurrentDyr(Terning.Dyr.LØVE);
        }

        assert (fireLike.poeng() == 4);

        fireLike.getTerninger().get(0).setCurrentDyr(Terning.Dyr.SLANGE);
        fireLike.getTerninger().get(1).setCurrentDyr(Terning.Dyr.PANDA);

        assert (fireLike.poeng() == 0);
    }
}
