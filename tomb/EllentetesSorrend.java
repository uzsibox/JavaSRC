package tomb;

import java.util.Scanner;

public class EllentetesSorrend {


    //Írjunk programot, mely a felhasználótól 5 darab egész számot kér be.
    //A program a beolvasás után írja a standard kimenetre a beolvasott számokat ellentétes sorrendben.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Mivel az n változó egyetlen számot tartalmaz (az aktuálisat), ezért minden lépésben felülírjuk. Ez azt jelenti,
        // hogy kizárólag mindig az utolsó számot tudjuk megjeleníteni. Nem tudjuk pl. az elsőt.
        //Ezért le kellene őket tárolni.

        /*A tömböket több érték tárolására tudjuk használni.
        A tömb egy statikus homogén adatszerkezet.
            1. homogén -> nem tartalmazhat különböző típusú adatokat.
            2. statikus -> a tömb méretét nem változtathatjuk meg a program futása során.
        Fontos: A tömb méretét előre definiálni kell. A tömb mérete az elemeinek száma.

        A tömb elemeit el tudjuk érni az indexük (sorszám) alapján. Tehát minden elemnek van egy indexe.
        FONTOS: A tömb első elemének indexe 0!
        Java-ban a következőképpen definiálhatunk egy tömböt:
        típus[] tömb_név = new típus[méret];

        Pl. 5 darab egész számot tartalmazó tömb:
        int[] tomb = new int[5];

        Kezdőértékeket is adhatunk a tömbnek.
        Pl. int[] tomb = {5,1,0,-1,2};

        A tömb első eleme: tomb[0] -> 5
        A tömb mérete: tomb.length -> 5
        A tömb utolsó eleme: tomb[tomb.length-1] -> tomb[5-1] -> tomb[4] -> 2
        Minden tömb utolsó elemének indexe: a tömb mérete - 1

        Ha tömb minden elemét el szeretném érni, akkor be kell járni a tömböt.
        Egy tömböt for ciklussal lehet bejárni.

        for(int i  = 0; i < tomb.length; i++){
            ...
        }

        visszafelé:
        for(int i  = tomb.length-1; i >= 0; i--){
            ...
        }

         */

        //Tudjuk előre, hogy 5 elemre van szükségünk, ezért
        int[] tomb = new int[5];

        for (int i = 0; i < 5; i++) { //Az i értéke mindig az aktuális tömbelemre vonatkozik. Mindig eggyel növekszik.
            tomb[i] = sc.nextInt();
            /*
            1. lépés:
            i = 0
            tomb[i] = sc.nextInt() -> tomb[0] = valami;

            2. lépés:
            i = 1
            tomb[i] = sc.nextInt() -> tomb[1] = valami;

            ...
             */
        }

        System.out.println("Tömb elemei beolvasásukkal ellentétes sorrendben:");
        for (int i = tomb.length-1; i >= 0 ; i--) {
            System.out.println(tomb[i]);
        }


    }


}
