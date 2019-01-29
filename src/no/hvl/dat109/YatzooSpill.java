package no.hvl.dat109;


import java.util.ArrayList;

/**
 * Definerer Yatzoo spill
 *
 * @author Enah
 */
public class YatzooSpill {

    private ArrayList<Spiller> spillere = new ArrayList<Spiller>();

    public void leggTilSpiller(Spiller spiller) {
        spillere.add(spiller);
    }

    /**
     * Tildele runder for hver spiller
     */
    public void tildelRunder() {
        for (Spiller spiller : spillere) {
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.LØVE));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.SLANGE));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.PANDA));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.GRIS));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.ELEFANT));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.HVAL));
            spiller.tildelRunde(new NLikeRunde(3));
            spiller.tildelRunde(new NLikeRunde(4));
            spiller.tildelRunde(new ToParRunde());
            spiller.tildelRunde(new HusRunde());
            spiller.tildelRunde(new UlikeRunde());
            spiller.tildelRunde(new YatzooRunde());
        }
    }

    public void spillRunde(Spiller spiller){

    }


    /**
     * Finner spillerene som har flest poeng, altså vinneren
     * Hvis ingen spillere blir null retunert
     * @return vinneren, eller null hvis ingen spillere
     */
    public Spiller finnVinner() {
        return spillere.stream().max((a, b) -> a.antallPoeng() - b.antallPoeng()).orElse(null);
    }
}