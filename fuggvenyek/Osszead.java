package fuggvenyek;

public class Osszead {

    /*
    Függvény általános alakja

    láthatósági módosító [static] típus név(formális paraméterek){
        utasítás_1;
        utasítás_2;
        ...
        utasítás_n;
        return kimenet;
    }

     */

    public static int osszead(int x, int y){ //a függvénynek két paramétere van: 2 db egész szám (x és y)
        int c = x + y; //lokális változó, csak a függvényen belül tudjuk elérni.
        return c; //a függvény kimenete az x+y szám lesz és a függvény ezt adja vissza
        //FONTOS: x+y típusa (kimenet típusa) int kell, hogy legyen!
    }

    public static int osszead(int x, int y, int z){ //a metódusok nevei "túlterhelhetőek" (overload). Ez azt jelenti, hogy két metódusnak lehet ugyanaz a neve, DE ilyenkor
                                                    //a formális paramétereinek listájában különböznie kell: pl. számukban vagy típusukban
        return x+y+z;
    }

    public static void main(String[] args) { //a main egy void típusú, ez azt jelenti, hogy az ilyen típusú metódusoka nem adnak vissza kimeneti értéket
                                             //Eljárásnak nevezzük őket. Metódus: függvények + eljárások
        int a = 5;
        int b = 1;
        int c = 4;
        int d = osszead(a,b);  //függvényhívás: a main metódus meghívja az összead(int x, int y) függvényt. Ekkor az x helyére 5-öt ír és az y helyére pedig 1-et.
                                //majd kiszámolja az 5+1 értékét és visszaadja. Ekkor a d értéke 6 lesz (a függvény kimenetét írjuk a d-be)
        System.out.println("Összeg: "+d);
        System.out.println("Összeg: "+osszead(a,b,c));

    }
    //a metódusok sorrendje nem számít
    public static void main(String[] args, int x) {
        System.out.println("Valami");
    }


}
