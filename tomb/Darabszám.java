package tomb;

public class Darabszám {

    //1) A páratlan pozitív egész számok darabszáma
    public static void main(String[] args) {

        int[] tomb = {10, 21, 21, 7, 8, -2, 3, 0, 21, 4};
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 != 0 && tomb[i] > 0) {
                db++;
            }
        }
        System.out.println(" A páratlan pozitív egész számok darabszáma =" + db);

        //2) A páros elemek átlaga
        int szum = 0 ;
        int parosdb=0 ;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0) {
                szum += tomb[i];
                parosdb++;
            }

        }
        System.out.println("A páros elemek átlaga = " +(double)szum / (double)parosdb);
    }
}
