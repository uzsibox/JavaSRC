package tombig;

import java.util.Scanner;

public class DerekszoguHaromszog {

    /*
    Olvassunk be 3 egész számot. A számok egy háromszög egy-egy oldalát reprezentálják.
    A program döntse el, hogy a megadott háromszög derékszögű-e.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a háromszög első oldalát!");
        int a = sc.nextInt();
        System.out.println("Adja meg a háromszög második oldalát!");
        int b = sc.nextInt();
        System.out.println("Adja meg a háromszög harmadik oldalát!");
        int c = sc.nextInt();

        //mielőtt megvizsgálnánk, hogy derékszögű-e, nézzük meg, hogy a háromszög megszerkeszthető-e.
        if(a+b > c && a+c > b && b+c > a){

            if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2) || Math.pow(c,2) + Math.pow(b,2) == Math.pow(a,2)){
                System.out.println("Derékszögű!");
            }
            else{
                System.out.println("Nem derékszögű");
            }

        }
        else{
            System.out.println("A háromszög nem megszerkeszthető!");
        }



    }


}
