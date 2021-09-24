package sztring;

import java.util.Scanner;

public class Hazifeladat2 {

    public static void main(String[] args) {
       /*1.	feladat: Olvasson be egy sztringet a standard bemenetről, majd írja
        ki a sztringben előforduló az ábécé sorrendben legutolsó kisbetűjét.
        Bemenet: zebra
        Kimenet: z

        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon  meg egy szöveget: ");
        String s = sc.nextLine();
        char max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (Character.isLowerCase(c) && c > max) {
                max = c;
            }
        }
        System.out.println("Az ábécé sorrendben legutolsó kisbetűje = " +Character.toString(max));



        //2.feladat: Írja ki a sztring számjegyeinek szórását
        double szum = 0;
        int db = 0;

        double szoras = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);



            if (Character.isDigit(c) ) {
                szum += c-'0';
                db++;

            }

            }
        double atlag = szum/db;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                szoras += ((c-'0' - atlag)*(c-'0' - atlag))/db;
            }
        }
        System.out.println(szoras);
        szoras = Math.sqrt(szoras);
        System.out.println(" A számjegyek szórása  = " +szoras  );
    }
}
