package ciklusok;

import java.util.Scanner;

public class While0VegjeligMax {

    //Írjunk programot, mely a felhasználótól egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a legnagyobb beolvasott számot.

    public static void main(String[] args) {

        /*
        Példa: 5 2 4 7 1 0
        max -> egy változó, mely az aktuális legnagyobb számot tartalmazza (az eddig beolvasott számok közül)
        Minden lépésben meg kell vizsgálni, hogy az aktuális szám (n) nagyobb-e, mint a max. Ha igen, akkor új maxot találtunk
        tehát le kell cserélni a max értékét n-re. Ha kisebb, akkor nem csinálunk semmit.

        max -> kezdőértékének egy olyan számot kell választani, amely biztosan kisebb, mint az összes szám (Integer.MIN_VALUE -> legkisebb egész szám)
        1. lépés:
        n = 5
        n > max? --> 5 > max --> 5 > Integer.MIN_VALUE --> IGAZ
        max = n --> max = 5

        2. lépés:
        n = 2
        n > max? --> 2 > max --> 2 > 5 --> HAMIS

        3. lépés:
        n = 4
        n > max? --> 4 > max --> 4 > 5 --> HAMIS

        4. lépés:
        n = 7
        n > max? --> 7 > max --> 7 > 5 --> IGAZ
        max = n --> max = 7

        5. lépés:
        n = 1
        n > max? --> 1 > max --> 1 > 7 --> HAMIS

        6. lépés:
        n = 0 --> break

         */

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true){

            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            if(n > max){
                max = n;
            }

        }
        System.out.println("A legnagyobb szám: "+max);



    }




}
