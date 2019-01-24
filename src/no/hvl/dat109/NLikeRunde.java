package no.hvl.dat109;

public class NLikeRunde extends Runde {
    private int n;

    public NLikeRunde(int n) {
        this.n = n;
    }

    public int poeng() {
        return harNLike(n) ? n : 0;
    }
}
