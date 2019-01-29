package no.hvl.dat109;

public class YatzooRunde extends Runde {

    /**
     * @return 10 hvis alle terninger like ellers 0
     */
    public int poeng() {
        return harNLike(5) ? 10 : 0;
    }
}