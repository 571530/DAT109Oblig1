package no.hvl.dat109;

public class DyrRunde extends Runde {

    private Terning.Dyr dyr;

    public Terning.Dyr getDyr() {
        return dyr;
    }

    /**
     *
     * @param dyret som skal samles på i runden
     */
    public DyrRunde(Terning.Dyr dyr) {
        this.dyr = dyr;
    }

    /**
     *
     * @return antall terninger som har likt dyr som runden
     */
    public int poeng() {
        return (int) getTerninger().stream().filter(a -> a.getCurrentDyr().equals(dyr)).count();
    }
}
