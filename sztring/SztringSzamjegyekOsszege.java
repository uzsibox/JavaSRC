package sztring;

import java.util.Scanner;

public class SztringSzamjegyekOsszege {

    /*
    Olvassunk be egy sztringet a standard bemenetről. A sztring tartalmazhat számjegy karaktereket is.
    A program írja a standard kimenetre a sztringben lévő számjegyek összegét.

    Bemenet: alma123fa5
    Kimenet: 11

     */

    static public void main(String[] args) { //a static és public szavak sorrendje felcserélhető

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int szum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                System.out.println("szum: "+szum);
                szum += c-48;

                /*
                ASCII kód       számjegy
                48              0
                49              1
                50              2
                ...             ...
                57              9
                 */


            }
        }
        System.out.println("A számjegyek összege: "+szum);
    }


}
