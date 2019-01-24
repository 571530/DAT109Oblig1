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

    @Test
    public void NUlikeTest() {
        Runde femUlike = new NUlikeRunde(5);

        femUlike.getTerninger().get(0).setCurrentDyr(Terning.Dyr.LØVE);
        femUlike.getTerninger().get(1).setCurrentDyr(Terning.Dyr.PANDA);
        femUlike.getTerninger().get(2).setCurrentDyr(Terning.Dyr.HVAL);
        femUlike.getTerninger().get(3).setCurrentDyr(Terning.Dyr.ELEFANT);
        femUlike.getTerninger().get(4).setCurrentDyr(Terning.Dyr.SLANGE);

        assert (femUlike.poeng() == 5);

        femUlike.getTerninger().get(1).setCurrentDyr(Terning.Dyr.LØVE);

        assert (femUlike.poeng() == 0);

    }

    @Test
    public void ToParTest() {
        Runde toParRunde = new ToParRunde();

        toParRunde.getTerninger().get(0).setCurrentDyr(Terning.Dyr.HVAL);
        toParRunde.getTerninger().get(1).setCurrentDyr(Terning.Dyr.HVAL);
        toParRunde.getTerninger().get(2).setCurrentDyr(Terning.Dyr.PANDA);
        toParRunde.getTerninger().get(3).setCurrentDyr(Terning.Dyr.PANDA);
        toParRunde.getTerninger().get(4).setCurrentDyr(Terning.Dyr.HVAL);

        assert (toParRunde.poeng() == 4);

        // Fire like regnes også som to par
        toParRunde.getTerninger().get(3).setCurrentDyr(Terning.Dyr.HVAL);

        assert (toParRunde.poeng() == 4);

        toParRunde.getTerninger().get(3).setCurrentDyr(Terning.Dyr.LØVE);

        assert (toParRunde.poeng() == 0);
    }

    @Test
    public void HusTest() {
        Runde husRunde = new HusRunde();

        husRunde.getTerninger().get(0).setCurrentDyr(Terning.Dyr.LØVE);
        husRunde.getTerninger().get(1).setCurrentDyr(Terning.Dyr.LØVE);
        husRunde.getTerninger().get(2).setCurrentDyr(Terning.Dyr.PANDA);
        husRunde.getTerninger().get(3).setCurrentDyr(Terning.Dyr.PANDA);
        husRunde.getTerninger().get(4).setCurrentDyr(Terning.Dyr.PANDA);

        assert (husRunde.poeng() == 5);

        husRunde.getTerninger().get(1).setCurrentDyr(Terning.Dyr.PANDA);

        assert (husRunde.poeng() == 0);
    }
}
