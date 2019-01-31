package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

public class Spiller {

    public String getNavn() {
        return navn;
    }

    private String navn;
    private ArrayList<Runde> runder = new ArrayList<>();

    public Spiller(String navn){
        this.navn = navn;
    }

    /**
     * Legger til en ny runde i spilleren
     * @param runde
     */
    public void tildelRunde(Runde runde) {
        this.runder.add(runde);
    }


    /**
     * Går inn i spesifikk runde og gjør ønskede omtrill
     * @return false om vi er tomme for runder eller true
     */
    public boolean spillRunde(){
        Runde runde = runder.stream().filter(a -> !a.ferdig()).findFirst().orElse(null);

        if (runde != null){
            while (!runde.ferdig()) {
                System.out.println(runde.getNavn());
                Tekstgrensesnitt.visTerninger(runde.getTerninger());
                List<Integer> valg = Tekstgrensesnitt.lesValg();
                if (valg.isEmpty()) {
                    System.out.println("Beholder terninger");
                    runde.behold();
                }
                else {
                    System.out.println("Kaser på nytt");
                    runde.trillTerningN(valg);
                }
                Tekstgrensesnitt.visTerninger(runde.getTerninger());
            }
            System.out.println(navn + " fikk " + runde.poeng() + " denne runden");
            return true;
        }
        return false;
    }


    /**
     * @return summen av poengene for alle rundene
     */
    public int antallPoeng() {
        return runder.stream().map(Runde::poeng).reduce(0, (a, b) -> a + b);
    }

    /**
     * @return navnet til spilleren som String
     */
    @Override
    public String toString() {
        return "Spiller{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
