package tombig;

import java.util.Scanner;

public class PárosOsszegParatlanOsszegTavolsag {
    //Írjunk programot, mely a felhasználótól  egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a páros és páratlan számok összegének távolságát.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int szumpoz = 0;
        int szumneg = 0;

        while (true) {

            int n = sc.nextInt();
            //ha a beolvasott szám 0, akkor lépjen ki a ciklusból.
            //Egy ciklusból a break utasítással tudunk kilépni
            //A program ezután a ciklus utáni első utasítással folytatódik
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                szumpoz += n;
            }
            if (n % 2 != 0) {
                szumneg += n;
            }
        }

        System.out.println("A páros és páratlaan számok távolsága = " + Math.abs(szumpoz - szumneg));
    }
}