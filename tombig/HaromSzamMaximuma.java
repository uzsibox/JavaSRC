package tombig;

import java.util.Scanner;

public class HaromSzamMaximuma {

    //Olvassunk be 3 egész számot és jelenítsük meg, hogy melyik a legnagyobb.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        if(a >= b && a >= c){
            max = a;
        }
        if(b >= a && b >= c){
            max = b;
        }
        if(c >= b && c >= a){
            max = c;
        }
        System.out.println("A legnagyobb elem: "+max);

    }



}
