package tombig;

import java.util.Scanner;

public class Honapok {

    /*
    Olvassunk be egy 1 és 12 közötti egész számot, mely egy hónap sorszámát reprezentálja, majd jelenítse meg a hónap nevét.

    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a hónap sorszámát!");
        int ho = sc.nextInt();

        switch(ho){
            case 1: System.out.println("Január"); break;
            case 2: System.out.println("Február"); break;
            case 3: System.out.println("Március"); break;
            case 4: System.out.println("Április"); break;
            case 5: System.out.println("Május"); break;
            case 6: System.out.println("Június"); break;
            case 7: System.out.println("Július"); break;
            case 8: System.out.println("Augusztus"); break;
            case 9: System.out.println("Szeptember"); break;
            case 10: System.out.println("Október"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Nem megfelelő adat!");
        }

    }



}
