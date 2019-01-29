package no.hvl.dat109;

import java.util.Scanner;

public class Tekstgrensesnitt {
    private YatzooSpill yatzoo;

    public Tekstgrensesnitt() {
        yatzoo = new YatzooSpill();
    }

    public void init() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Antall spillere?");
        int antallSpillere = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < antallSpillere; i++) {
            System.out.println("Navn på spiller nr " + i + "?");
            String navn = sc.nextLine();
            yatzoo.leggTilSpiller(new Spiller(navn));
        }
    }

}
