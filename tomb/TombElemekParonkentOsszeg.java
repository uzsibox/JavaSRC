package tomb;

public class TombElemekParonkentOsszeg {

    //Írjon programot, mely egy tömb elemeinek páronkénti összegeit jelenítni meg a lent látható formátumban.

    /*
    Példa: 5 1 2 3 7

    5 + 1 = 6              0 1
    5 + 2 = 7              0 2
    5 + 3 = 8              0 3
    5 + 7 = 12             0 4

    1 + 2 = 3              1 2
    1 + 3 = 4              1 3
    1 + 7 = 8              1 4

    2 + 3 = 5              2 3
    2 + 7 = 9              2 4

    3 + 7 = 10             3 4

     */

    public static void main(String[] args) {

        int[] tomb = {5, 1, 2, 3, 7};

        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = i+1; j < tomb.length; j++) {
                System.out.println(tomb[i] + " + " + tomb[j] + " = " + (tomb[i] + tomb[j]));
            }
            System.out.println();
        }

    }
}
