package no.hvl.dat109;

public class DyrRunde extends Runde {

    private Terning.Dyr dyr;

    public Terning.Dyr getDyr() {
        return dyr;
    }

    public DyrRunde(Terning.Dyr dyr) {
        this.dyr = dyr;
    }

    public int poeng() {
        return (int)getTerninger().stream().filter(a -> a.getCurrentDyr().equals(dyr)).count();
    }
}
