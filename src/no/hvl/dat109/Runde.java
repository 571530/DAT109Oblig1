package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Runde {

    private ArrayList<Terning> terninger = new ArrayList<>();
    private int antallkast = 3;

    public ArrayList<Terning> getTerninger() {
        return terninger;
    }

    public int getAntallkast() {
        return antallkast;
    }

    public boolean harNLike(int n) {
        return getTerninger().stream()
                .anyMatch(a -> getTerninger().stream()
                        .filter(b -> a.getCurrentDyr().equals(b.getCurrentDyr())).count() >= n);
    }

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

    public void behold() {
        antallkast = 0;
    }

    public boolean ferdig() {
        return antallkast <= 0;
    }

    public abstract int poeng();
}
