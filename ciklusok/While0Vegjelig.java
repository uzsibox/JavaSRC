package ciklusok;

import java.util.Scanner;

public class While0Vegjelig {

    //Írjunk programot, mely a felhasználótól nemnegatív egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a beolvasott számok összegét.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int szum = 0;
        int n = sc.nextInt(); //kezdőérték
        while(n != 0){ //feltétel
            szum += n;
            n = sc.nextInt(); //léptetés
        }

        System.out.println("A beolvasott számok összege: "+szum);
    }




}
