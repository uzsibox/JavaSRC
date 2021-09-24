package sztring;

import java.util.Scanner;

public class CaesarKodolas {

    //Olvassunk be egy szót és minden karakterét toljuk el 2-vel.
    //a->c
    //z->b
    //y->a

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Adja a meg kódolandó szöveget: ");
        String s = sc.nextLine();

        System.out.println("A kódolt szöveg (2-es eltolással)");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == 'z'){
                System.out.print("b");
            }
            else if(c == 'y'){
                System.out.println("a");
            }
            else{
                System.out.print(Character.toString(c+2));  //c+2 esetén c char típusú és a 2 int típusú. Ekkor az eredmény is int lesz így ezeket sztringgé kell konvertálni
            }

        }

        System.out.println("\nAdja a meg az eltolás mértékét: ");
        int n = sc.nextInt();
        System.out.println("A kódolt szöveg ("+n+"-es eltolással)");

        for (int i = 0; i < s.length(); i++) {

            /*
            n = 5

            'a' = 97
            'z' = 122

            97 + n -> 102
            ...
            118 + n -> 97
            119 + n -> 98
            120 + n -> 99
            121 + n -> 100
            122 + n -> 101

             */
            char c = s.charAt(i);
            if(c+n <= 122){
                System.out.print(Character.toString(c+n));
            }
            else{
                System.out.print(Character.toString(c-(26-n)));
            }


        }


    }


}
