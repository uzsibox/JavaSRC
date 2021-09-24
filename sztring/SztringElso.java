package sztring;

import java.util.Locale;

public class SztringElso {

    /*
    Sztring = karakterlánc vagy sorozat
    Pl. szó, mondat

    Javaban egy sztringre a String osztály egy példánya (objektuma).

    String s = "almafa";  --> az "almafa" egy sztring (idézőjelek közé kell tenni) és az s pedig erre a sztringre mutató referencia változó.

     */

    public static void main(String[] args) {

        String s = "almafa";

        System.out.println("Az s sztring hossza: " + s.length());
        //Egy sztringben minden karakternek van indexe (sorszáma). Az első karakter indexe 0!
        System.out.println("Az s sztring első karaktere: " + s.charAt(0));
        System.out.println("Az s sztring utolsó karaktere: " + s.charAt(s.length()-1));

        //Bejárni egy sztringet for ciklussal tudunk.
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        //FONTOS: egy sztring Java-ban nem módosítható. Ezt azt jelenti, hogy nem tudom módosítani egyes karaktereket,
        //illetve nem tudok beszúrni új karaktert vagy törölni belőle.

        System.out.println("\n----- Sztringek konkatenációja (összefűzése) -----");
        //1.
        String s2 = s.concat(" es kortefa");
        System.out.println("s2: " + s2);
        //2.
        s2 = s + "es kortefa";
        System.out.println("s2: " + s2);

        s = s + "k";
        System.out.println("s: " + s);

        System.out.println("----- Sztringek összehasonlítása -----");
        s = "alma";
        s2 = "clma";
        if(s.equals(s2)){ //az equals megnézi, hogy a két sztring karakterről karakterre megegyezik-e
            System.out.println(s + " és " + s2 + " egyenlőek!");
        }
        else{
            System.out.println(s + " és " + s2 + " NEM egyenlőek!");
        }

        System.out.println(s + " és " + s2 + "összehasonlítása (ábécé sorrend alapján): " + s.compareTo(s2));
        /*
        a compareTo metódus az s és s2 sztringet hasonlítja össze karakterről karakterre.
        Veszi az ASCII kódját minden karakterpárnak és ezeket pedig kivonja egymásból.

        Pl. az első karakterpár: a - c
        a ASCII kódja: 97
        c ASCII kódja: 99

        97 - 99 = -2

        Az első különböző karakterpár ASCII kódjának különbségét adja vissza. Ha a két sztring egyenlő, akkor 0-t.
         */

        //Tegyük fel, hogy a két sztring hossza egyenlő
        System.out.print("Saját compareTo: ");
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != s2.charAt(i)){
                System.out.println(s.charAt(i)-s2.charAt(i));
            }

        }

        System.out.println("----- Keresés sztringben -----");
        s = "almafa";
        System.out.println("A(z) " + s + " sztringben az első a betű helye: " + s.indexOf('a'));  //az indexOf() visszaaadja egy sztringben a bemenetként kapott
        // karakter első előfordulásának helyét. Ha nem tartalmazza az adott karaktert, akkor a kimenet értéke -1 lesz.
        System.out.println("A(z) " + s + " sztringben az utolsó a betű helye: " + s.lastIndexOf('a')); //itt az utolsó előfordulásának indexét adja vissza

        System.out.println("A(z) " + s + " sztringben az fa sztring helye: "+s.indexOf("fa")); //visszaadja a bemenetként kapott sztring kezdetének helyét
        //a lastIndexOf() esetén is hasonló

        System.out.println("A(z) " + s + " sztring tartalmazza-e a fa sztringet: " + s.contains("fa"));
        System.out.println("A(z) " + s + " sztring a fa sztringgel kezdődik-e: " + s.startsWith("fa"));
        System.out.println("A(z) " + s + " sztring a fa sztringgel végződik-e: " + s.endsWith("fa"));


        System.out.println("----- Részsztringek -----");

        System.out.println("A(z) " + s + " sztring első 4 karaktere: " + s.substring(0,4)); // [0,4) a 4. index már nincs benne.
        System.out.println("A(z) " + s + " sztring utolsó 2 karaktere: " + s.substring(s.length()-2)); //ha a végéig akarjuk megadni a sztringet, akkor nem kell az endIndex
        System.out.println("A(z) " + s + " sztring 2. és 5. karaktere közti rész: " + s.substring(2,6));

        System.out.println("----- Sztring átalakítások -----");
        s = "AlmafaK es Kortefak        ";
        String nagybetus = s.toUpperCase();
        System.out.println("A(z) " + s + " sztring nagybetűsen: "+ nagybetus);
        String kisbetus = s.toLowerCase();
        System.out.println("A(z) " + s + " sztring nagybetűsen: "+ kisbetus);

        System.out.println("A(z) " + s + " sztringből a záró whitespace karaktereket törölve: "+ s.strip()); //A strip() egy sztring záró whitespace karaktereit törli.



    }


}
