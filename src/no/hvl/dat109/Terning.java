package no.hvl.dat109;

import java.util.Random;

public class Terning {


    private enum Dyr {
        LØVE, SLANGE, PANDA, GRIS, ELEFANT, HVAL;


        public static Dyr getTilfeldigDyr {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

}
