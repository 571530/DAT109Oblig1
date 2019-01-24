package no.hvl.dat109;

public class NLikeRunde extends Runde {
    private int n;

    public NLikeRunde(int n) {
        this.n = n;
    }

    public int poeng() {
        boolean nLike = getTerninger().stream()
                .anyMatch(a -> getTerninger().stream()
                        .filter(b -> a.getCurrentDyr().equals(b.getCurrentDyr())).count() >= n);

        return nLike ? n : 0;
    }
}
