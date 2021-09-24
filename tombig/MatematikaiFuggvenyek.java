package tombig;

public class MatematikaiFuggvenyek {

    public static void main(String[] args) {

        //Java-ban a matematikai függvényeket a Math osztály tartalmazza.
        //Egy matematikai függvényre az alábbi módon lehet hivatkozni: Math.függvény

        double x = 5.78;
        double y = 5.12;
        //kerekítés
        System.out.println("Kerekítés");
        System.out.println("x kerekítve: "+Math.round(x));
        System.out.println("y felfelé kerekítve: "+Math.ceil(y));
        System.out.println("x lelfelé kerekítve: "+Math.floor(y));
        //Nem tudjuk megadni, hogy hány tizedesjegy pontosságra kerekítsen. Csak egészre tudunk.
        double z = 12.7163;
        //Kerekítsük z-t két tizedesjegy pontosságra. Kimenet: 12.72
        //Módszer:
        //1. lépés: szorozzuk be százzal z-t --> 12.7162 * 100 -> 1271.62
        //2. lépés: kerekítsük az előző számot a legközelebbi egészre --> 1272
        //3. lépés: Oszzuk el 100-zal az előző számot --> 1271 / 100 -> 12.72
        double kerektive = Math.round(z*(double)100)/(double)100;
        System.out.println("Z kerekítve: "+kerektive);
        System.out.println("-------------------------------");

        //hatványozás művelete:
        System.out.println("Hatványozás");
        int n = 5;
        System.out.println("5^3: "+Math.pow(n,3));
        System.out.println("e^2: "+Math.exp(2)); //e -> Euler-szám
        System.out.println("gyök(n): "+Math.sqrt(n));
        System.out.println("3. gyök n: "+Math.pow(n,(double)1/(double)3));  //3gyök(5) --> 5^(1/3)
        System.out.println("-------------------------------");


        //Matematikai konstansok: PI és E
        System.out.println("Konstansok");
        System.out.println("PI: "+Math.PI);
        System.out.println("Euler-szám: "+Math.E);
        System.out.println("-------------------------------");

        //Egyéb függvények: abs, log, sin, cos, tan, toDegrees, toRadians
        int a = 90;
        System.out.println("sin(a): "+Math.sin(Math.toRadians(a))); //a trigonometrikus függvények radiánban számolnak, ezért ha fokban adtuk meg a szög értékét
                                                                    //át kell konvertálni radiánba
        System.out.println("cos(a): "+Math.cos(Math.toRadians(a)));
        System.out.println("tan(a): "+Math.tan(Math.toRadians(a)));
        System.out.println("| -5 | = "+Math.abs(-5));


    }



}
