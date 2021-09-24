package tombig;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        //Feltételes elágaztatás: if-else szerkezet
        //Általános alakja:
        /*
        if(feltétel){
            utasítás_1;
            utasítás_2;
            ...
            utasítás_n;
        }
        else{
            utasítás_else_1;
            utasítás_else_2;
            ...
            utasítás_else_n;
        }

        //Ha feltétel igaz, akkor az if blokkjánan lévő utasítások futnak le. Ha hamis, akkor az else ágban lévők.
         */

        //A feltétel tetszőleges logikai feltétel lehet.

        //Olvassunk be egy egész számot a billentyűzetről és vizsgáljuk meg, hogy páros-e.
        //Standard bemenetről (billentyűzet) egy ún. Scanner objektummal tudunk beolvasni.
        Scanner sc = new Scanner(System.in);  //az sc egy Scanner típusú objektum. A System.in azt jelenti, hogy a standard bemenetről fog olvasni. Ide egy fájl is megadható.
        System.out.println("Adjon meg egy egész számot!");
        int n = sc.nextInt(); //nextInt() -> egy egész számot olvas be
        //nextFloat();
        //nextDouble();
        //stb
        System.out.println("n = "+n);

        if(n%2 == 0){ //ha n-et 2-vel osztom, akkor ne legyen maradék, azaz a maradék legyen 0
            //n%2 --> kiszámolja a maradékot
            //n%2 == 0 --> megvizsgálja, hogy a kapott maradék egyenlő-e nullával. FONTOS: n%2 = 0 nem jó, mert ez értékadás
            System.out.println("Páros");
        }
        else{
            System.out.println("Páratlan");
        }



    }

}
