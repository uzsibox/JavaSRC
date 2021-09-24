public class Szorzotabla {

    public static void main(String[] args) {
        /*
        itt csak egy index változik
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        A szorzótábla esetén két indexünk van egy sor és egy oszlopindex.
        A sorindex soronként mindig rögzített és egy sorban csak az oszlopindexek növekednek.
        Mikor végigmentünk egy soron (azaz az oszlopindex értéke 9), akkor új sor következik és
        az oszlopindexet 1-re állítjuk (kezdőértékre) az sor aktuális értékét pedig növeljük eggyel.

        Két egymásba ágyazott for ciklussal lehet megoldani.

        Szorzótábla:
        1x1 1x2 1x3 ... 1x9
        2x1 2x2 2x3 ... 2x9
        ...             ...
        9x1 9x2 9x3 ... 9x9
        */

        //a \t karakter a TAB
        //a \n karakter az ENTER

        System.out.println("\t\t\t\t\t\t\tSzorzótábla");
        for (int i = 1; i < 10; i++) { //sorindex lesz az i
            for (int j = 1; j < 10; j++) { //az oszlopindex pedig a j
                System.out.print(i + "x" + j + "=" + i*j +"\t");
            }
            System.out.println(); //amikor elérünk ide, akkor elértünk az aktuális sor végére. Ilyenkor tegyünk egy új sor karaktert
        }



    }




}
