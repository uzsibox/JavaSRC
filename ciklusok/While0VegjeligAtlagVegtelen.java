package ciklusok;

import java.util.Scanner;

public class While0VegjeligAtlagVegtelen {

    //Írjunk programot, mely a felhasználótól nemnegatív egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a beolvasott számok átlagát.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int szum = 0;
        int db = 0;

        while(true){

            int n = sc.nextInt();
            //ha a beolvasott szám 0, akkor lépjen ki a ciklusból.
            //Egy ciklusból a break utasítással tudunk kilépni
            //A program ezután a ciklus utáni első utasítással folytatódik
            if(n == 0){
                break;
            }

            szum += n;
            db++;
        }

        System.out.println("A beolvasott számok összege: "+szum);
        double atlag = (double)szum / (double)db; //db-1 kell, mert a 0-t nem kell belevenni
        System.out.println("A beolvasott számok átlaga: "+atlag);



    }




}
