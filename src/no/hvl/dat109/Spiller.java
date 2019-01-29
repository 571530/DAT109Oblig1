package no.hvl.dat109;

import java.util.ArrayList;

public class Spiller {

    private String navn;
    private ArrayList<Runde> runder = new ArrayList<>();

    public Spiller(String navn){
        this.navn = navn;
    }

    /**
     * Legger til en ny runde i spilleren
     * @param runde
     */
    public void tildelRunde(Runde runde) {
        this.runder.add(runde);
    }


    /**
     * Går inn i spesifikk runde og gjør ønskede omtrill
     * @return enkelt runde
     */
    public void spillRunde(){

        Runde runde = runder.stream().filter(a -> !a.ferdig()).findAny().orElse(null);
        if (runde != null){
            //runde.trillTerningN();
        }

    }

    /**
     * @return summen av poengene for alle rundene
     */
    public int antallPoeng() {
        return runder.stream().map(Runde::poeng).reduce(0, (a, b) -> a + b);
    }
}
