package tombig;

import java.util.Scanner;

public class Hónap {
    /*
    Olvassunk be egy 1 és 12 közötti egész számot, mely egy hónap sorszámát reprezentálja, majd jelenítse meg a hónap nevét.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a hónap sorszámát!");
        int ho = sc.nextInt();
        if (ho == 1) {
            System.out.println("Január");
        }
        if (ho == 2) {
            System.out.println("Február");
        }
        if (ho == 3) {
            System.out.println("Március");
        }
        if (ho == 4) {
            System.out.println("Április");
        }
        if (ho == 5) {
            System.out.println("Május");
        }
        if (ho == 6) {
            System.out.println("Junius");
        }
        if (ho == 7) {
            System.out.println("Július");
        }
        if (ho == 8) {
            System.out.println("Augusztus");
        }
        if (ho == 9) {
            System.out.println("Szeptember");
        }
        if (ho == 10) {
            System.out.println("Október");
        }
        if (ho == 11) {
            System.out.println("November");
        }
        if (ho == 12) {
            System.out.println("December");
        }
        if (ho<1 || ho>12){
            System.out.println("Nem megfelelő adat");
        }

    }
}
