package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Runde {

    private ArrayList<Terning> terninger = new ArrayList<>();
    private int antallkast = 3;


    /**
     * lager ny runde med 5 terninger,
     */
    public Runde() {
        terninger.add(new Terning());
        terninger.add(new Terning());
        terninger.add(new Terning());
        terninger.add(new Terning());
        terninger.add(new Terning());

        for (Terning terning : terninger) {
            terning.trill();
        }

        antallkast--;
    }

    /**
     * triller en valgt terning om igjen
     * @return terning
     */
    public void trillTerningN(int n){
        if(n <= 5){
            terninger.get(n).trill();
        }
    }

    /**
     * går gjennom alle terningene
     * @return terninger som spesifiseres i trillTerningN(int n)
     * @param trill
     */
    public void trillTerningN(List<Integer>trill){
        for (int i = 0; i < trill.size(); i++){
            trillTerningN(trill.get(i));
        }
        antallkast--;
    }

    /**
     * henter terningene
     * @return ternigene
     */
    public ArrayList<Terning> getTerninger() {
        return terninger;
    }

    /**
     * henter antall kast
     * @return antallkast
     */
    public int getAntallkast() {
        return antallkast;
    }

    /**
     * returner om runde har n antall like
     * @param n
     * @return om n antall like terninger
     */
    public boolean harNLike(int n) {
        return getTerninger().stream()
                .anyMatch(a -> getTerninger().stream()
                        .filter(b -> a.getCurrentDyr().equals(b.getCurrentDyr())).count() >= n);
    }

    /**
     * henter liste med alle par
     * @return liste med par
     */
    public List<Par<Terning>> hentPar() {
        List<Par<Terning>> allePar = new ArrayList<>();

        IntStream.range(0, terninger.size()).forEach(i -> {
            IntStream.range(0, i).forEach(j -> {
                allePar.add(new Par<Terning>(terninger.get(i), terninger.get(j)));
            });
        });

        List<Par<Terning>> par = allePar.stream()
                .filter(p -> p.getT1().getCurrentDyr().equals(p.getT2().getCurrentDyr()))
                .collect(Collectors.toList());

        List<Par<Terning>> unikePar = new ArrayList<>();

        par.stream().forEach(p1 -> {
            if (!unikePar.stream().anyMatch(p2 -> p2.contains(p1))) {
                unikePar.add(p1);
            }
        });

        return unikePar;
    }

    /**
     * setter antallKast til 0
     */
    public void behold() {
        antallkast = 0;
    }

    /**
     * sjekker om runden har flere kast
     * @return om det er flere kast
     */
    public boolean ferdig() {
        return antallkast <= 0;
    }

    /**
     * henter antall poeng for runden
     * @return antall poeng fra runden
     */
    public abstract int poeng();
}
