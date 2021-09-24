package tomb;

public class szoras {
    //Füzetben szórás

    public static void main(String[] args) {

        double[] tomb = {10, 21, 21, 7, 8, -2, 3, 0, 21, 4};


        //Tömb elemeinek összege
        int szum = 0;
        for (int i = 0; i < tomb.length; i++) {
            szum += tomb[i]; //szum = szum + tomb[i];
        }
        System.out.println("A tömb elemeinek összege: " + szum);

        //Tömb elemeinek átlaga
        double avg = (double) szum / (double) tomb.length;
        System.out.println("A tömb elemeinek átlaga: " + avg);

        double ss = 0;
        for (int i = 0; i < tomb.length; i++) {
            ss += Math.pow(tomb[i]-avg,2);
        }
        double szoras = Math.sqrt(ss/ (tomb.length-1));
        System.out.println("Szórás = " +szoras);
    }


}

