package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tekstgrensesnitt {
    public List<Spiller> lesSpillere() {
        ArrayList<Spiller> spillere = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Antall spillere?");
        int antallSpillere = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < antallSpillere; i++) {
            System.out.println("Navn på spiller nr " + i + "?");
            String navn = sc.nextLine();
            spillere.add(new Spiller(navn));
        }

        return spillere;
    }

}
