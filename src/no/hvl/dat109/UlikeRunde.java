package no.hvl.dat109;

public class UlikeRunde extends Runde {

    /**
     * @return 5, hvis alle terninger ulike ellers 0
     */
    public int poeng() {
        for (Terning terning1 : getTerninger()) {
            for (Terning terning2 : getTerninger()) {
                if (terning1 != terning2 && terning1.getCurrentDyr().equals(terning2.getCurrentDyr()))
                    return 0;
            }
        }

        return 5;
    }

}
