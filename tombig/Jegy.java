package tombig;

import java.util.Scanner;

public class Jegy {

    /*
    Olvassunk be egy 0 és 100 közti egész számot, mely egy dolgozat pontszámát reprezentálja,
    majd a megadott táblázat alapján jelenítse meg a megfelelő érdemjegyet szövegesen.

    0-60    elégtelen
    61-70   elégséges
    71-80   közepes
    81-90   jó
    91-100  jeles

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy 0 és 100 közötti számot!");
        int pont = sc.nextInt();

        /*
        ROSSZ MEGOLDÁS:

        if(pont >= 0 && pont <= 60){
            System.out.println("Elégtelen");
        }
        if(pont >= 61 && pont <= 70){
            System.out.println("Elégséges");
        }
        if(pont >= 71 && pont <= 80){
            System.out.println("Közepes");
        }
        if(pont >= 81 && pont <= 90){
            System.out.println("Jó");
        }
        if(pont >= 91 && pont <= 100){
            System.out.println("Jeles");
        }
        else{
            System.out.println("Nem megfelelő adat!");
        }

        pont = 67

        pont >= 0 && pont <= 60   --> HAMIS
        pont >= 61 && pont <= 70  --> IGAZ --> "elégséges"
        pont >= 71 && pont <= 80  --> HAMIS
        pont >= 81 && pont <= 90  --> HAMIS
        pont >= 91 && pont <= 100 --> HAMIS --> else ág fut le --> "Nem megfelelő adat!" (az else csak az utolsó if-re vonatkozik)
         */

        if(pont >= 0 && pont <= 60){
            System.out.println("Elégtelen");
        }
        else if(pont >= 61 && pont <= 70){
            System.out.println("Elégséges");
        }
        else if(pont >= 71 && pont <= 80){
            System.out.println("Közepes");
        }
        else if(pont >= 81 && pont <= 90){
            System.out.println("Jó");
        }
        else if(pont >= 91 && pont <= 100){
            System.out.println("Jeles");
        }
        else{
            System.out.println("Nem megfelelő adat!");
        }

        /*
        MÁSIK MEGOLDÁS:

        if(pont >= 0 && pont <= 60){
            System.out.println("Elégtelen");
        }
        if(pont >= 61 && pont <= 70){
            System.out.println("Elégséges");
        }
        if(pont >= 71 && pont <= 80){
            System.out.println("Közepes");
        }
        if(pont >= 81 && pont <= 90){
            System.out.println("Jó");
        }
        if(pont >= 91 && pont <= 100){
            System.out.println("Jeles");
        }
        if(pont < 0 || pont > 100){
            System.out.println("Nem megfelelő adat!");
        }
        */


    }


}
