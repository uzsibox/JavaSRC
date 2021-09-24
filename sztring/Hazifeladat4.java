package sztring;

import java.util.Scanner;

public class Hazifeladat4 {
    public static void main(String[] args) {
        //5.	feladat: Módosítsa úgy a sztringet, hogy minden a betű helyett e betű szerepeljen benne.
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon  meg egy sztringet: ");
        String s = sc.nextLine();

        String uj = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                uj += s.charAt(i);
            }
            if (s.charAt(i) == 'a') {
                uj += 'e';
            }

        }
        System.out.println("E betűre változtatva: " + uj);

        // 6.Vizsgálja meg, hogy a beolvasott sztring palindrom-e (visszafelé olvasva is ugyanaz. Pl. görög)

        String uj2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            uj2 += s.charAt(i);

        }
        if (s.compareTo(uj2) == 0) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Nem Palindrom");
        }
        System.out.println("A szó fordítva =" + uj2);

    }
}


