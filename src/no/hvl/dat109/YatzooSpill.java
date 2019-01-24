package no.hvl.dat109;


import java.util.ArrayList;

/**
 * Definerer Yatzoo spill
 * @author Enah
  */
public class YatzooSpill{

    private ArrayList<Spiller> spillere = new ArrayList<Spiller>();

    /**
     * Tildele runder for hver spiller
     */
    public void tildelRunder(){
        for (Spiller spiller : spillere) {
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.LØVE));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.SLANGE));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.PANDA));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.GRIS));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.ELEFANT));
            spiller.tildelRunde(new DyrRunde(Terning.Dyr.HVAL));
            spiller.tildelRunde(new NLikeRunde(3));
            spiller.tildelRunde(new NLikeRunde(4));
            // Mangler to par
            // Mangler hus
            spiller.tildelRunde(new NUlikeRunde(5));
            spiller.tildelRunde(new YatzooRunde());
        }
    }

    /**
     * Finner vinneren
     *
     * @return vinneren
     */
    public Spiller finnVinner(){
        return spillere.stream().max((a, b) -> a.antallPoeng() - b.antallPoeng()).orElse(null);
    }
}