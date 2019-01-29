package no.hvl.dat109;

public class NLikeRunde extends Runde {
    private int n;

    /**
     *
     * @param n, hvor mange like runden skal ha
     */
    public NLikeRunde(int n) {
        this.n = n;
    }

    /**
     *
     * @return n hvis n antall like ellers 0
     */
    public int poeng() {
        return harNLike(n) ? n : 0;
    }
}
