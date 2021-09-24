package ciklusok;

import java.util.Scanner;

public class While0VegjeligAtlag {

    //Írjunk programot, mely a felhasználótól nemnegatív egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a beolvasott számok átlagát.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int szum = 0;
        int db = 0; //a db váltózó fogja megmondani, hogy hány darab számot olvastunk be. Kezdetben 0 db-ot.

        int n = sc.nextInt(); //kezdőérték
        db++; //a darab változót meg kell növelni eggyel, mert beolvastunk egy számot
        while(n != 0){ //feltétel
            szum += n;
            n = sc.nextInt(); //léptetés
            db++; //a darab változót meg kell növelni eggyel, mert beolvastunk egy számot
        }

        System.out.println("A beolvasott számok összege: "+szum);
        double atlag = (double)szum / (double)(db-1); //db-1 kell, mert a 0-t nem kell belevenni
        System.out.println("A beolvasott számok átlaga: "+atlag);



    }




}
