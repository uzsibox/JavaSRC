package ciklusok;

public class ForCiklus {

    //Írjunk programot, mely megjelenítni az első 10 pozitív egész számot a képernyőn.

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("i: "+i);
        }

        System.out.println("1. megoldás: 1-20 közötti páros egész számok");
        for (int i = 1; i < 21; i++) {
            if(i%2==0){
                System.out.println("i: "+i);
            }
        }
        System.out.println("2. megoldás: 1-20 közötti páros egész számok");
        for (int i = 2; i < 21; i += 2) {
            System.out.println("i: "+i);
        }

        System.out.println("1. megoldás: 10-1 közötti egész számok visszafelé");
        for (int i = 10; i >= 1; i--) {
            System.out.println("i: "+i);
        }

        System.out.println("1. megoldás: 1-20 közötti 3-mal és 4-gyel osztható egész számok");
        for (int i = 1; i < 21; i++) {
            if(i%3 == 0 && i%4 == 0){
                System.out.println("i: "+i);
            }
        }

        System.out.println("1. megoldás: 1-20 közötti 3-mal osztható, de 4-gyel nem osztható egész számok");
        for (int i = 1; i < 21; i++) {
            if(i%3 == 0 && i%4 != 0){
                System.out.println("i: "+i);
            }
        }



    }





}


