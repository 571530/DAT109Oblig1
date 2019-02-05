package no.hvl.dat109;


import java.util.ArrayList;
import java.util.List;


public class YatzooSpill {

    private List<Spiller> spillere = new ArrayList<Spiller>();


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

    public void init() {
        spillere = Tekstgrensesnitt.lesSpillere();
        tildelRunder();
    }

    /**
     * Start spillet og hver spiller spiller en runde til vi er tom for runder
     */
    public void spill() {
        System.out.println("Starter spillet");
        boolean ferdig = spillere.isEmpty() && spillere.stream().anyMatch(x -> !x.getRunder().isEmpty());
        while (!ferdig) {
            for (Spiller spiller: spillere) {
                System.out.println(spiller.getNavn() + " sin tur");
                ferdig = !spiller.spillRunde();
            }
        }
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