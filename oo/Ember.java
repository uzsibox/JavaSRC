package oo;

public class Ember {

    /*
    A felhasználótól kérjünk be emberekről szóló adatokat soronként állományvégjelig (EOF).
    Egy sor a következő formátumú: név;életkor;nem

    A név kizárólag az angol ábécé betűiből és szóköz karakterekből álló sztring.
    Az életkor egy egész szám. A nem szintén egy sztring, melynek lehetséges értékei: férfi/nő.

    A program írja ki azokat az embereket, akik idősek a beolvasásukka ellentéses sorrendben. Egy embert idősnek tekintünk, ha 65 évnél idősebb.

    Példa bemenet:
    Nagy Gusztáv;25;férfi
    Kovács János;70;férfi
    Kiss Erika;66;nő
    Kiss Erzsébet;34;nő

    Kimenet:
    Kiss Erika
    Kovács János

     */

    //Az osztály egy absztrakt programozási eszköz, amely leírja, hogy az egyes egyedek, milyen attribútumokkal rendelkezik és, hogyan "viselkednek".
    //

    //A class is a user defined blueprint or prototype from which objects are created.
    //It represents the set of properties or methods that are common to all objects of one type.
    //In general, class declarations can include these components, in order:

    //felsoroljuk, hogy az adott egyedek (emberek) milyen attribútumokkal rendelkeznek:
    String nev;
    int eletkor;
    boolean nem;
    int szuletesiEv;

    public static final int AKTUALIS = 2021; //konstans definiálása (final)
    //static -> osztályszintű
    //minden objektum rendelkezik az AKTUALIS nevű konstanssal, DE mindenkinél ugyanaz az értéke!!!

    //Konstruktor: elkészíti az objektumot (inicializálja) a megadott adatok alapján.
    //Objektumot csak a konstruktor meghívásával lehet létrehozni.
    //Egy primitív típusú változó értékadásánál csak az értékadó (=) operátort kell használni és a kifejezés jobb oldalára pedig egy literált írunk
    //Pl. int n = 5; --> 5 egy egész típusú literál

    //Konstruktornak MEG KELL EGYEZNIE az osztály nevével.
    //public Ember(String NEV, int EV, boolean NEM){ //a konstruktornak 3 paramétere van: NEV, EV, NEM
    //    //a megkapott argumentumok alapján elkészíti az objektumot (a megfelelő adattagokat feltölti a megkapott értékekkel)
    //    nev = NEV;
    //    szuletesiEv = EV;
    //    nem = NEM;
    //}

    //ALT + INSERT --> Consturtor

    //a this az aktuális objektumra vonatkozik
    public Ember(String nev, boolean nem, int szuletesiEv) {
        this.nev = nev;
        this.nem = nem;
        this.szuletesiEv = szuletesiEv;
        this.eletkor = AKTUALIS-szuletesiEv; //az életkor származtatható a születési évből, ezért őt nem paraméterként kapjuk meg, hanem mi fogjuk kiszámolni
    }

    //Egy objekumnak van viselkedése is, mely a metódusainak összeségét jelenti.


    //Egy Ember objektum sztring reprezentációját adja meg.
    @Override
    public String toString() {
        //String ferfiNo = nem == true?"ferfi":"no"; //if-else rövidítése
        String ferfiNo = nem?"ferfi":"no";
        return nev + "(" + eletkor + ")" + " egy " + ferfiNo;
    }


    //Készítsünk függvényt, mely egy emberről eldönti, hogy idős-e (65-évnél idősebb-e).
    /*public boolean isOld(){
        if(this.eletkor > 65){ //a this elhagyható
            return true
        }
        else{
            return false;
        }
    }
    */
    public boolean isOld(){
        return eletkor > 65;
    }

    public boolean isOld(int kor){
        return eletkor > kor;
    }


    public static void main(String[] args) {

        Ember e; //definiáltunk egy Ember "típusú" változót e néven.
        int n;   //definitáltunk egy int típusú változót n néven.

        n = 5;  //n-nek értéket adunk.

        e = new Ember("Nagy Gusztáv",true,1991); // a new kulcsszóval hívjuk meg az Ember osztály konstruktorát és létrehozok vele egy embert. Ezt a folyamatot példányosításnak nevezzük.
        /*
        A konstruktor hívása a következőképpen történik:

        public Ember(String nev, boolean nem, int szuletesiEv) {
            this.nev = nev;
            this.nem = nem;
            this.szuletesiEv = szuletesiEv;
        }
        --->
        public Ember("Nagy Gusztáv", false, 1991) {
            e.nev = "Nagy Gusztáv";
            e.nem = false;
            e.szuletesiEv = 1991;
        }
         */

        Ember e2 = new Ember("Kiss Ilona",false,1945);

        System.out.println("Megjelenítés manuálisan");
        System.out.println("Név: " + e.nev + " életkor: " + e.eletkor + " nem: " + e.nem);
        System.out.println("Név: " + e2.nev + " életkor: " + e2.eletkor + " nem: " + e2.nem);
        System.out.println("===========================");

        System.out.println("Megjelenítés toString()-gel");
        System.out.println(e.toString());
        System.out.println(e2);
        System.out.println("========================");

        System.out.println(e.isOld());  //this --> e
        System.out.println(e2.isOld()); //this --> e2
        System.out.println(e.isOld(25));




    }


}
