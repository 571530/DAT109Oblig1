package no.hvl.dat109;

import java.util.List;

public class HusRunde extends Runde {

    public String getNavn() {
        return "Hus runde";
    }

    /**
     * Hvis hus returnerer den 5 eller 0
     * @return 5 hvis hus eller 0
     */
    public int poeng() {
        List<Par<Terning>> par = hentPar();

        // Må være to par
        if (par.size() < 2)
            return 0;
        // Parene kan ikke være av lik type
        if (par.get(0).getT1().getCurrentDyr().equals(par.get(1).getT1().getCurrentDyr()))
            return 0;
        // Må ha 3 like
        if (!harNLike(3))
            return 0;
        return 5;
    }
}
