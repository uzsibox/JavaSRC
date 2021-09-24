import java.util.Scanner;

public class Házifeladat {
    public static void main(String[] args) {

        //1. Olvass be egy valós számot és jelenítsd meg a hozzá legközelebbi egész értéket.
        Scanner sc = new Scanner(System.in);
        System.out.println("Írjon be egy valós számot");
        double a = sc.nextDouble();
        System.out.println("Legközelebbi egész érték= " + Math.round(a));

        System.out.println("--------------------------------------------------------");

        //2.Olvasd be egy kör sugarát (valós) majd számold ki és jelenítsd meg az adott sugarú kör kerületét és területét.

        System.out.println("Írjon be egy kör sugarát");
        double b = sc.nextDouble();
        System.out.println("A kör kerülete= " + (2 * b * Math.PI));
        System.out.println("A kör területe= " + (b * b * Math.PI));

        System.out.println("--------------------------------------------------------");

        /*4. Kérjük be a felhasználótól egy henger alapjának sugarát és magasságát (valós értékek). Számítsd ki és
        jelenítsd meg a henger térfogatát.
        a. Egészítsd ki úgy a programot, hogy ha a felhasználó 0 vagy negatív értéket adott meg, akkor
        a képlet helyett az „érvénytelen adat” jelenjen meg a képernyőn. */
        System.out.println("Adjon meg egy henger sugarát ");
        double sugár = sc.nextDouble();
        System.out.println("Adjon meg egy henger magasságát ");
        double magasság = sc.nextDouble();
        if (sugár > 0 && magasság > 0)
            System.out.println("A henger térfogata=" + (sugár * sugár * Math.PI * magasság));
        else
            System.out.println("Érvénytelen adat");
    }

}