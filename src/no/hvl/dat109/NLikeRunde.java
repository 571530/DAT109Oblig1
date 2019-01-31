package no.hvl.dat109;

public class NLikeRunde extends Runde {
    private int n;
    private String navn = "";

    /**
     *
     * @param n, hvor mange like runden skal ha
     */
    public NLikeRunde(int n) {
        this.n = n;
        navn = "" + n + " like runde";
    }

    @Override
    public String getNavn() {
        return navn;
    }

    /**
     *
     * @return n hvis n antall like ellers 0
     */
    public int poeng() {
        return harNLike(n) ? n : 0;
    }
}
