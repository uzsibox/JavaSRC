package tombig;

import java.util.Scanner;

public class PozitivNegativ {

    //Írjunk programot, mely a standard bemenetről egy egész számot olvas be, majd megvizsgálja, hogy a szám pozitív vagy negatív-e.
    //A program ennek megfelelően jelenítsen meg szöveget.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot!");
        int n = sc.nextInt();

        //ROSSZ: 0-t negatívként kezeli, mert a 0 > 0 feltétel hamis így az else ág fut le
        //if(n > 0){
        //    System.out.println("Pozitív");
        //}
        //else{
        //    System.out.println("Negatív");
        //}

        //2 if egyben. Egymásba ágyazott if
        //Ha több ága van az if-nek, tehát több lehetséges kimenet van
        if(n > 0){
            System.out.println("Pozitív");
        }
        else if(n < 0){
            System.out.println("Negatív");
        }
        else{ //ez az else az második if-hez tartozik
            System.out.println("Nulla");
        }



    }


}
