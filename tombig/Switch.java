package tombig;

import java.util.Scanner;

public class Switch {

    /*
    Olvassunk be egy 0 és 10 közti egész számot. Ha a szám páros, akkor írja ki, hogy "Páros"
    egyébként írja ki, hogy "Páratlan". A megoldás során használjunk switch-case szerkezetet.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot!");
        int n = sc.nextInt();

        //ha valamelyik case igaz lesz, akkor az összes case le fog futni addig míg egy break utasítást nem talál.
        switch (n){

            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: System.out.println("Páros"); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9: System.out.println("Páratlan"); break;
            default: System.out.println("Nem megfelelő érték!");

        }


    }

}
