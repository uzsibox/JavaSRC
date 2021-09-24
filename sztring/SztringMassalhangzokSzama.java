package sztring;

import java.util.Scanner;

public class SztringMassalhangzokSzama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int db = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            /*
            mássalhangzó: betű + nem magánhangzó
            if( !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') && Character.isLetter(c) ){
                db++;
            }
            */
            if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && Character.isLetter(c) ){
                db++;
            }

            /*
            De Morgan azonosság:
                1. !(x && y) <==> !x || !y
                2. !(x || y) <==> !x && !y
             */


        }

        System.out.println("A(z) " + s + " sztringben szereplő mássalhangazók száma: " + db);

    }



}
