package tomb;

public class sorozat {

    //Füzetben sorozat.src megjelenítése (Szum i->n  1/(t(i)+1)^2)

    public static void main(String[] args) {

        double[] tomb = {10, 21, 21, 7, 8, -2, 3, 0, 21, 4};
        double szum = 0;
        for (int i = 0; i < tomb.length; i++) {
            double tmp = 1 / Math.pow(tomb[i] + 1, 2);
            szum += tmp;
        }
        System.out.println( "A sorozat értéke = " +szum );
    }
}
