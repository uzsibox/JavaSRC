package sztring;

import java.util.Scanner;

public class SztringDuplaz {

    //Olvassunk be egy sztringet és a program jelenítse meg a standard kimeneten a sztringet úgy, hogy minden karakterét duplázza.

    //Bemenet: AlmaFA
    //Kimenet: AAllmmaaFFaa

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String uj = "";
        for (int i = 0; i < s.length(); i++) {
            uj += s.charAt(i);
            uj += s.charAt(i);
        }

        System.out.println("Duplázva: " + uj);

        //Csak a nagybetűs karaktereket duplázza.

        String uj2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                uj2 += s.charAt(i);
                uj2 += s.charAt(i);
            } else {
                uj2 += s.charAt(i);
            }
        }
        System.out.println("Nagybetű duplázva: " + uj2);


        // Csak minden második karakter legyen duplázva

        String uj3 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                uj3 += s.charAt(i);
                uj3 += s.charAt(i);
            } else {
                uj3 += s.charAt(i);
            }

        }
        System.out.println("Minden második karakter duplázva: " + uj3);
    }

    }
