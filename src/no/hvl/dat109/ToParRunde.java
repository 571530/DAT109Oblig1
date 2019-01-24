package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;


public class ToParRunde extends Runde {

    public int poeng() {
        return hentPar().size() >= 2 ? 4 : 0;
    }
}
