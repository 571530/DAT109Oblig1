package no.hvl.dat109;

/**
 *
 */
public class YatzooApp{
    public static void main(String[] args){
        YatzooSpill yspill = new YatzooSpill();
        Tekstgrensesnitt tg = new Tekstgrensesnitt();
        for (Spiller spiller : tg.lesSpillere()){ //vet ikke om jeg tenker riktig her hehe
            yspill.leggTilSpiller(spiller);
        }




    }







}