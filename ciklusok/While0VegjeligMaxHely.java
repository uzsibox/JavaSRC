package ciklusok;

import java.util.Scanner;

public class While0VegjeligMaxHely {

    //Írjunk programot, mely a felhasználótól egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a legnagyobb beolvasott szám sorszámát.

    public static void main(String[] args) {

        /*
        Példa: 5 2 4 7 1 0

        max = Integer.MIN_VALUE;
        int max_hely;
        int sorszam = 1;

        1. lépés:
        n = 5
        n > max? --> 5 > max --> 5 > Integer.MIN_VALUE --> IGAZ
            max = n --> max = 5
            maxhely = sorszam --> maxhely = 1
        sorszam++;

        2. lépés:
        n = 2
        n > max? --> 2 > max --> 2 > 5 --> HAMIS
        sorszam++;

        3. lépés:
        n = 4
        n > max? --> 4 > max --> 4 > 5 --> HAMIS
        sorszam++;

        4. lépés:
        n = 7
        n > max? --> 7 > max --> 7 > 5 --> IGAZ
            max = n --> max = 7
            maxhely = sorszam --> maxhely = 4
        sorszam++;

        5. lépés:
        n = 1
        n > max? --> 1 > max --> 1 > 7 --> HAMIS
        sorszam++;

        6. lépés:
        n = 0 --> break

         */

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int maxhely = 0;
        int sorszam = 1;

        while(true){

            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            if(n > max){
                max = n;
                maxhely = sorszam;
            }

            sorszam++;

        }
        System.out.println("A legnagyobb szám: "+max + " sorszáma: "+maxhely);



    }




}
