package ciklusok;

import java.util.Scanner;

public class While0VegjeligMin {

    //Írjunk programot, mely a felhasználótól egész számokat kér be míg 0-t nem ad meg.
    //A program a beolvasás után írja a standard kimenetre (képernyő) a legkisebb beolvasott számot.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(true){

            int n = sc.nextInt();
            if(n == 0){
                break;
            }

            if(n < min){
                min = n;
            }

        }
        System.out.println("A legkisebb szám: "+min);


    }

}
