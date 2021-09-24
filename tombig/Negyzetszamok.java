package tombig;

public class Negyzetszamok {

    // Jelenítsd meg a 0 és 1000 közé eső négyzetszámokat!

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            /*
            ha az i egy négyzetszám, akkor jelenítsük meg.
            i négyzetszám ha a gyöke egész szám
            megoldás: (int)sqrt(i)*(int)sqrt(i) == i
            Példa: 9
            sqrt(9) -> 3
            (int)sqrt(9) -> 3
            (int)sqrt(9) * (int)sqrt(9) -> 9 --> IGAZ

            Példa2: 5

            sqrt(5) -> 2,23
            (int)sqrt(5) -> 2
            (int)sqrt(5) * (int)sqrt(5) -> 4 --> HAMIS
            */

            if( (int)Math.sqrt(i)*(int)Math.sqrt(i) == i  ){
                System.out.println("Négyzetszám: "+i);
            }


        }

        
    }



}
