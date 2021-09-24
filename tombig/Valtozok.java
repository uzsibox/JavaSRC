package tombig;

public class Valtozok {

    /*
    A változók adatok tárolására alkalmasak
    Minden változónak van:
    1. neve
    2  típusa
    3. értéke

    A változók atomi értékeket tudnak tárolni (pl. szám, betű)
    Ezeket Java-ban primitív típusoknak nevezzük.
    Primitív típusok:
    1. int      --> egész szám: [-2^31;+2^31]  32 bit
    2. byte     --> egész szám: [0,255] 8 bit
    3. short    --> egész szám 16 bit
    4. long     --> egész szám 64 bit
    5. float    --> tizedestört
    6. double   --> tizedestört
    7. char     --> karakter (ASCII kód)
    8. boolean  --> logikai típus (true/false)

    A változó neve tetszőleges (betűvel vagy aláhúzásjellel kezdődik, utána pedig állhat számjegy is).
    Fontos, hogy a változók nevének egyedinek kell lennie. Nem lehet két azonos nevű változó

    Ha egy változót szeretnék használni és letárolni benne egy értéket, akkor dekraláni kell (létre kell hozni).

    Java:
    típus név = érték;

    pl.
    int x = 5; --> x egy int típusú változó, melynek értéke 5.
    float y = 5.5;



    */

    public static void main(String[] args) {

        int x = 5;
        //A kódon belül, ha a változó nevét használom, akkor ott az értéke jelenik meg.
        System.out.println(x);  //--> x helyére 5-öt ír és azt jeleníti meg, nem pedig az x-et mint betűt
        System.out.println("x"); //ha az x betűt akarom megjeleníteni, akkor idézőjelek közé kell tenni.
        System.out.println("x = "+x); //x = 5 alalkban írja ki. A plusz jel hozzáfűzi az "x = " részhez az x értéket

        /*
        Operátorok:

        általános alaklja egy kifejezésnek: opearndus1 operátor operandus2
        pl. x + y

        1. Aritmetikai operátorok:
           összeadás: +
           kivonás: -
           szorzás: *
           osztás: / (egész osztás)
           maradékos osztás: %

        2. Összehasonlító operátorok: <, >, <=, >=, ==, !=

        3. Logikai operátorok:
           ÉS: &&
           VAGY: || (Alt Gr + W)
           NEM: !

        4. Értékadó operátorok: =, +=, -=, *=, /=, ++, --

         */

        int y = 2;
        System.out.println("y = "+y);
        int z = x + y; //a z változó az előző kettő összegét tartalmazza
        int a = 2*x; //az értékadás jobb oldalán tetszőleges kifejezés állhat

        System.out.println("Aritmetikai műveletek");
        System.out.println("x + y = "+z);
        System.out.println("x - y = "+(x-y)); //egy kifejezés értékét is meg tudja jeleníteni
        System.out.println("x * y = "+x*y);
        System.out.println("x / y = "+x/y); //5/2 --> 2 (mert a / az egész osztást jelenti)
        System.out.println("x % y = "+x%y);

        //Számoljuk ki x/y értékét úgy, hogy a törtrész is jelenjen meg, de a két változó típusa int legyen!
        //Erre való az ún. típuskonverzió. Egy kifejezésben egy-egy változó típusát a kifejezés kiértékelése alatt megváltoztathatjuk
        //A változó eredeti típusát nem fogja megváltoztatni.

        System.out.println("x / y = "+ (float)x / (float)y  );
        //(float) x --> x típusát float-tá konvertálja

        //értékadás
        //Növeljük meg x értékét 10-zel
        x = x + 10;
        x += 10;

        //Növeljük meg y értékét eggyel
        y = y + 1;
        y+=1;
        y++;
        //y-- eggyel csökkenti az y értékét



    }


}
