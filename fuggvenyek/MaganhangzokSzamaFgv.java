package fuggvenyek;

import java.util.Scanner;

public class MaganhangzokSzamaFgv {

    //Írjunk függvényt, mely egy sztringre megadja a benne szereplő magánhangzók darabszámát.
    //Kimenet típusa: int
    //Bemenetek: String

    public static int countVowels(String s){
        int db = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'  ){
                db++;
            }

        }
        return db;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("A(z) " + s + " sztringben szereplő magánhangzók száma: " + countVowels(s));
        String s2 = sc.nextLine();
        System.out.println("A(z) " + s + " sztringben szereplő magánhangzók száma: " + countVowels(s2));

        /*
        int db = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'  ){
                db++;
            }

        }

        System.out.println("A(z) " + s + " sztringben szereplő magánhangzók száma: " + db);

        String s2 = sc.nextLine();

        db = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'  ){
                db++;
            }

        }

        System.out.println("A(z) " + s2 + " sztringben szereplő magánhangzók száma: " + db);
        */


    }


}
