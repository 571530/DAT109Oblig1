package no.hvl.dat109;

public class YatzooRunde extends Runde {

    public YatzooRunde() {

    }

    public int poeng() {
        return harNLike(5) ? 10 : 0;
    }
}