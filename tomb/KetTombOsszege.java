package tomb;

import java.util.Arrays;

public class KetTombOsszege {

    public static void main(String[] args) {

        //Legyen adott két ugyanakkora méretű egész számokat tartalmazó tömb.
        //Írjon programot, mely létrehoz egy harmadik tömböt, mely a bemenetként kapott két tömb azonos indexen lévő elemeinek összegét tartalmazza.

        int[] tomb1 = {5,10,2,3,9};
        int[] tomb2 = {5,11,12,30,4};

        int[] osszeg_tomb = new int[tomb1.length]; //készítsünk egy tömböt, melynek mérete az eredeti tömbök méretével egyenlő. Mivel a tomb1.length = tomb2.length, ezért
                                                   //bármelyiket használhatjuk

        for (int i = 0; i < tomb2.length; i++) {
            osszeg_tomb[i] = tomb1[i] + tomb2[i];
        }

        System.out.println(Arrays.toString(osszeg_tomb));


    }


}
