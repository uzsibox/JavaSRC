package sztring;

import java.util.Scanner;

public class Hazifeladat3 {
    public static void main(String[] args) {
             /*3.	feladat: Olvasson be egy egész számot a standard bemenetről, majd írja ki a számjegyeinek összegét
            Bemenet: 123
            Kimenet: 6
            */

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon  meg egy egész számot: ");
        int a = sc.nextInt();
        int szum = 0;
        while (a != 0) {
            int b = a % 10;
            szum += b;
            a = a / 10;

        }
        System.out.println(" A számjegyeinek összege: " + szum);
        sc.nextLine();

        // 4.	feladat: Törölje a sztringből az összes e betűt.
        System.out.println("Adjon  meg egy sztringet: ");
        String s = sc.nextLine();

        String uj = "";
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) != 'e' ) {
                uj += s.charAt(i);
            }
        }System.out.println("E betűk nélkül: " +uj);
    }



    }
