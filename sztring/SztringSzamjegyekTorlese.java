package sztring;

import java.util.Scanner;

public class SztringSzamjegyekTorlese {

    //Olvassunk be egy sztringet és töröljük belőle a számjegy karaktereket.

    //Bemenet: alm123fa5
    //Kimenet: almafa

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String uj = ""; //Egy új sztringet kell létrehozni és azokat a karaktereket kell beletenni, amik nem törlendőek.

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isDigit(c)){ //ha NEM számjegy
                uj+=c;
            }
        }

        System.out.println("Törölve: "+uj);

    }

}
