package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;


public class ToParRunde extends Runde {


    @Override
    public String getNavn() {
        return "To par runde";
    }

    /**
     * @return 4 hvis 2 par eller 0
     */
    public int poeng() {
        return hentPar().size() >= 2 ? 4 : 0;
    }
}
