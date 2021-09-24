package ciklusok;

import java.util.Scanner;

public class WhileParosSzamok {

    //Írjunk programot, mely a felhasználótól nemnegatív egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a beolvasott páros számok darabszámát.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int db = 0;

        while (true) {

            int n = sc.nextInt();
            //ha a beolvasott szám 0, akkor lépjen ki a ciklusból.
            //Egy ciklusból a break utasítással tudunk kilépni
            //A program ezután a ciklus utáni első utasítással folytatódik
            if ( n == 0) {
                break;
            }
            if (n %2 == 0) {

                db++;

            }


        }



        System.out.println("A beolvasott páros számok darabszáma: " + db);
    }

}
