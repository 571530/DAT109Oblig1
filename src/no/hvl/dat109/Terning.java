package no.hvl.dat109;

import java.util.Random;

public class Terning {

    static Dyr currentDyr;


    public static void setCurrentDyr(Dyr currentDyr) {
        Terning.currentDyr = currentDyr;
    }

    /**
     * Dyret som var på terningen er endret og blir returnert med metoden.
     *
     * @return Eit nytt dyr fra terningen.
     */
    public Dyr trill() {
        setCurrentDyr(Dyr.getTilfeldigDyr());
        return currentDyr;
    }

    private enum Dyr {
        LØVE,
        SLANGE,
        PANDA,
        GRIS,
        ELEFANT,
        HVAL;

        /**
         * Velger en tilfeldig verdi fra Dyr enum'en.
         *
         * @return et tilfeldig dyr.
         */
        public static Dyr getTilfeldigDyr() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
}
