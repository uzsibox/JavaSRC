package ciklusok;

import java.util.Scanner;

public class WhilePozitivNegativDB {
    //Írjunk programot, mely a felhasználótól egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a beolvasott pozitív és negatív számok darabszámát.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dbpoz = 0;
        int dbneg = 0;

        while (true) {

            int n = sc.nextInt();
            //ha a beolvasott szám 0, akkor lépjen ki a ciklusból.
            //Egy ciklusból a break utasítással tudunk kilépni
            //A program ezután a ciklus utáni első utasítással folytatódik
            if (n == 0) {
                break;
            }
            if (n > 0) {
                dbpoz++;
            }
            if (n < 0) {

                dbneg++;
            }


        }


        System.out.println("A beolvasott pozitív számok darabszáma: " + dbpoz);
        System.out.println("A beolvasott negatív számok darabszáma: " + dbneg); }
}
