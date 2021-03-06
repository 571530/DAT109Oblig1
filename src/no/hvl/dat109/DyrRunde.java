package no.hvl.dat109;

public class DyrRunde extends Runde {

    private Terning.Dyr dyr;
    private String navn = "";

    public Terning.Dyr getDyr() {
        return dyr;
    }



    /**
     *
     * @param dyr som skal samles på i runden
     */
    public DyrRunde(Terning.Dyr dyr) {
        this.navn = "\n" + dyr.toString() + " runde";
        this.dyr = dyr;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    /**
     *
     * @return antall terninger som har likt dyr som runden
     */
    public int poeng() {
        return (int) getTerninger().stream().filter(a -> a.getCurrentDyr().equals(dyr)).count();
    }
}
