package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tekstgrensesnitt {
    public static List<Spiller> lesSpillere() {
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

    public static List<Integer> lesValg() {

        Scanner sc = new Scanner(System.in);
        List<Integer> valgene = new ArrayList<>();

        System.out.println("Hvilke terninger vil du kaste på nytt?"
                + "\n1) " + "Terning 1"
                + "\n2) " + "Terning 2"
                + "\n3) " + "Terning 3"
                + "\n4) " + "Terning 4"
                + "\n5) " + "Terning 5"
                + "\n0) " + "Beholde alle terninger");

        int i = 5;
        String in = sc.nextLine();
        while (in != "0" && i == 0) {
            int valg = Integer.parseInt(in);
            valgene.add(valg);
            i--;
        }
        return valgene;
    }

    private static void visTerninger(List<Terning> terninger) {
        for (Terning t: terninger) {

        }
    }

}
