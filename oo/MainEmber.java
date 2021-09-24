package oo;

import java.util.Arrays;
import java.util.Scanner;

public class MainEmber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //nem tudjuk előre, hogy hány sort fog a felhasználó megadni -> while
        while(sc.hasNextLine()){ //hasNextLine() -> megmondja, hogy van-e még beolvasandó sor
            String sor = sc.nextLine(); //ha van beolvasandó sor, akkor olvassuk be

            //Egy sor egy-egy embert reprezentál. Minden ember a következő attribútumokkal rendelkezik:
            //1. név
            //2. életkor
            //3. nem
            //Ezeket az adatokat el kellene érni minden ember esetén --> a pontosvessző karakterek mentén kellene feldarabolni a sort
            //Javaban a split metódus segítségével fel tudunk szeletelni egy sztringet valamilyen elválasztó karakter(ek) mentén
            //A split metódus pedig visszaadja a szeleteket egy tömbben.
            String[] tomb = sor.split(";");
            System.out.println("Szeletek: " + Arrays.toString(tomb)); //Arrays.toString() a paraméterként kapott tömb elemeit sztringgé fűzi össze az alábbi formátumban:
            //[ elem_1, elem_2, ... , elem_n]

            //szövegesen tárolja az aktuális emberre vonatkozó adatokat
            //tomb[0] -> név
            //tomb[1] -> életkor
            //tomb[2] -> nem


        }


    }

}
