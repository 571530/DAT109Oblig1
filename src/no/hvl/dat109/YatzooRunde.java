package no.hvl.dat109;

public class YatzooRunde extends Runde {

    public YatzooRunde() {

    }

    public int poeng() {
        boolean alleLike = getTerninger().stream().allMatch(a -> a.getCurrentDyr().equals(getTerninger().get(0).getCurrentDyr()));
        return alleLike ? 10 : 0;
    }
}