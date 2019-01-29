package no.hvl.dat109;

/**
 *
 */
public class YatzooApp{
    public static void main(String[] args){
        YatzooSpill yspill = new YatzooSpill();

        yspill.spill();

        System.out.println("Vinneren er " + yspill.finnVinner());

    }







}