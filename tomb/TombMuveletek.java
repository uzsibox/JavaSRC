package tomb;

import java.util.Arrays;

public class TombMuveletek {

    public static void main(String[] args) {

        int[] tomb = {10,21,21,7,8,-2,3,0,21,4};

        //Tömböt egyszerű kiíratása
        System.out.println(Arrays.toString(tomb));

        //Tömb elemeinek összege
        int szum = 0;
        for (int i = 0; i < tomb.length; i++) {
            szum+= tomb[i]; //szum = szum + tomb[i];
        }
        System.out.println("A tömb elemeinek összege: "+szum);

        //Tömb elemeinek átlaga
        double avg = (double)szum / (double)tomb.length;
        System.out.println("A tömb elemeinek átlaga: "+avg);

        //A tömb legnagyobb eleme
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] > max){
                max = tomb[i];
            }
        }
        System.out.println("A tömb legnagyobb eleme: "+max);

        //A tömb legnagyobb eleme második megoldás: eggyel kevesebb elemet kell megvizsgálni
        max = tomb[0]; //Tfh. a legelső eleme a legnagyobb
        for (int i = 1; i < tomb.length; i++) {
            if(tomb[i] > max){
                max = tomb[i];
            }
        }
        System.out.println("A tömb legnagyobb eleme: "+max);

        //Hányszor fordult elő a maximális elem a tömbben?
        //2 lépésben lehet megcsinálni.
        //1. lépés: max megkeresése
        //2. lépés: végigmenni a tömbön, és megvizsgálni, hogy hányszor fordul elő a max

        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] == max){
                db++;
            }
        }
        System.out.println("A maximális elem "+db +"-szor fordult elő.");



    }




}
