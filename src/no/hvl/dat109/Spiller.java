package no.hvl.dat109;

import java.util.ArrayList;

public class Spiller {

    private String navn;
    private ArrayList<Runde> runder = new ArrayList<>();

    public Spiller(String navn){
        this.navn = navn;
    }

    public void tildelRunde(Runde runde) {
        this.runder.add(runde);
    }

    public int antallPoeng() {
        return runder.stream().map(Runde::poeng).reduce(0, (a, b) -> a + b);
    }
}
