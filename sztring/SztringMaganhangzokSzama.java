package sztring;

import java.util.Scanner;

public class SztringMaganhangzokSzama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //a sztringbe az enter karakterig letárolja az összes beolvasott karaktert
        //sc.next(); //a sztringbe az első whitespace karakterig letárolja az összes beolvasott karaktert

        int db = 0;
        for (int i = 0; i < s.length(); i++) { //bejárjuk a sztringet. Az i a sztring aktuális karakterének sorszáma
            char c = s.charAt(i); //a c változóbe kimentjük a sztring aktuális karakterét

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'  ){
                db++;
            }

        }

        System.out.println("A(z) " + s + " sztringben szereplő magánhangzók száma: " + db);

    }


}


