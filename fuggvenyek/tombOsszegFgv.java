package fuggvenyek;

public class tombOsszegFgv {

    public static double atlagTomb(int[] tomb){
        int szum = osszeadTomb(tomb);
        return (double)szum/(double)tomb.length;
    }
    public static int szorzatTomb(int[] tomb) {
        int szorzat = 1;
        for (int i = 0; i < tomb.length; i++) {
            szorzat *= tomb[i];
        }
        return szorzat;

    }

    //Írjon függvényt, mely egy paraméterként kapott tömb összegét visszaaadja.

    public static int osszeadTomb(int[] tomb) {
        int szum = 0;
        for (int i = 0; i < tomb.length; i++) {
            szum += tomb[i];
        }
        return szum;
    }

    public static int parosOsszeg (int[] tomb){
        int szum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]%2==0) {
                szum += tomb[i];
            }
        }
        return szum;
    }
    public static int paratlanDarab (int[] tomb){
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]%2!=0) {
                db++;
            }
        }
        return  db;
    }
    public static int legnagyobbElem (int[] tomb){
        int max = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i]>max) {
                max = tomb[i];
            }
        }
        return max;
    }

    /*
    Gyakorlás:
    Írjon függvényt, mely egy paraméterként kapott tömb esetén visszaadja:
    1. a tömb elemeinek szorzatát
    2. a tömb elemeinek átlagát
    3. a tömb páros elemeinek összegét
    4. a tömb páratlan elemeinek darabszámát
    5. a tömb legnagyobb elemét
     */


    public static void main(String[] args) {

        int[] t = {1, 5, 6, 1, 2, 0, 9, 5};
        System.out.println("A tömb elemeinek átlaga: " + atlagTomb(t));
        System.out.println("A tömb elemeinek szorzata: " + szorzatTomb(t));
        System.out.println("A tömb páros elemeinek összege: " + parosOsszeg(t));
        System.out.println("A tömb páratlan elemeinek darabszáma: " + paratlanDarab(t));
        System.out.println("A tömb legnagyobb eleme: " + legnagyobbElem(t));
        System.out.println("A tömb elemeinek összege: " + osszeadTomb(t));

    }

}
