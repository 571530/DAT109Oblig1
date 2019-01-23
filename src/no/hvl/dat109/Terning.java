package no.hvl.dat109;

import java.util.Random;

import static no.hvl.dat109.Terning.Dyr.getTilfeldigDyr;

public class Terning {

    public Dyr currentDyr;


    /**
     * Dyret som var på terningen er endret og blir returnert med metoden.
     *
     * @return Eit nytt dyr fra terningen.
     */
    public Dyr trill() {
        currentDyr = getTilfeldigDyr();


        return currentDyr;
    }

    public enum Dyr {
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
            Dyr d = values()[random.nextInt(values().length)];
            return d;
        }


    }
}
