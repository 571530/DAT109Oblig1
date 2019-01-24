package no.hvl.dat109;

import java.util.ArrayList;

public abstract class Runde {

    private ArrayList<Terning> terninger = new ArrayList<>();
    private int antallkast = 3;

    public ArrayList<Terning> getTerninger() {
        return terninger;
    }

    public int getAntallkast() {
        return antallkast;
    }

    public Runde() {
        terninger.add(new Terning());
        terninger.add(new Terning());
        terninger.add(new Terning());
        terninger.add(new Terning());
        terninger.add(new Terning());

        for (Terning terning : terninger) {
            terning.trill();
        }

        antallkast--;
    }

    public void behold() {
        antallkast = 0;
    }

    public boolean ferdig() {
        return antallkast <= 0;
    }

    public abstract int poeng();
}
