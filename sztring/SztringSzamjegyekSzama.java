package sztring;

import java.util.Scanner;

public class SztringSzamjegyekSzama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //a sztringbe az enter karakterig letárolja az összes beolvasott karaktert
                                  //sc.next(); //a sztringbe az első whitespace karakterig letárolja az összes beolvasott karaktert

        int db = 0;
        for (int i = 0; i < s.length(); i++) { //bejárjuk a sztringet. Az i a sztring aktuális karakterének sorszáma
            char c = s.charAt(i); //a c változóbe kimentjük a sztring aktuális karakterét
            if(Character.isDigit(c)){  //ha a c karakter számjegy, akkor a db változó értékét megnöveljük eggyel.
                db++;
            }

        }

        System.out.println("A(z) " + s + " sztringben szereplő számjegyek száma: " + db);

    }



}
