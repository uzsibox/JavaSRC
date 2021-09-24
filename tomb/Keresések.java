import java.util.Scanner;

public class Keresések {

    //Adjunk meg egy 10 darab egész számot tartalmazó tömböt. Olvassunk be egy egész számot és írjuk ki, hogy az adott szám
    //hanyadik eleme a tömbnek (index). Ha a keresendő szám nincs benne a tömbben, akkor ezt is jelezze a program.


    public static void main(String[] args) {

        int[] tomb = {7,2,1,0,-2,4,10,-1,1,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a keresendő elemet!");
        int n = sc.nextInt();

        //keresés:
        //1. TELJES KERESÉS

        //bejárjuk az egész tömböt. Minden elem esetén megvizsgáljuk, hogy az adott elem (i.) értéke egyenlő-e a keresett elemmel (n)
        //ha igen, akkor megállunk és kiírjuk az i értékét (sorszám).

        System.out.println("TELJES KERESÉS");
        int index = -1; //a keresett elem helyét (indexét) tárolja. Ha az értéke -1, akkor nem volt benne a tömbben.
        //Tegyük fel, hogy nincs benne a tömbben az elem.
        for (int i = 0; i < tomb.length; i++) {
            System.out.println("Az aktuális elem: "+tomb[i]);
            if(tomb[i] == n){
                index = i;
                break; //ha az elemet megtaláltuk, akkor fölöslegesen már ne keressünk tovább. Így mindig az első előfordulását találja meg az elemnek.
            }
        }

        if(index != -1){ //ha az index értéke nem -1, akkor benne van
            System.out.println("A keresett elem sorszáma: "+(index+1));
        }
        else{ //az index értéke kizárólag akkor lehet -1, ha  tomb[i] == n feltétel 1x sem volt igaz. --> ez azt jelenti, hogy az n nem volt benne a tömbben
            System.out.println("A keresett elem nem található!");
        }

        //2. LINEÁRIS KERESÉS

        //A lineáris keresés kizárólag rendezett tömbben tud keresni.

        System.out.println("LINERÁIS KERESÉS");
        int[] tomb2 = {-2,-1,0,1,1,2,4,7,9,10};

        //Tegyük fel, hogy a keresett elem a 6.
        //Egy plusz kilépő feltételt alkalmazhatunk. Ha a tömb aktuális eleme nagyobb, mint a keresett elem, akkor megállhatunk,
        //mert már biztosan nem lesz benne a tömbben. A példában a 7 és a 7 utáni elemekkel nem kell foglalkozni, mert itt biztosan nem lesz benne a 6-os (a rendezés miatt)

        index = -1; //a keresett elem helyét (indexét) tárolja. Ha az értéke -1, akkor nem volt benne a tömbben.
        //Tegyük fel, hogy nincs benne a tömbben az elem.
        for (int i = 0; i < tomb2.length; i++) {
            System.out.println("Az aktuális elem: "+tomb2[i]);
            if(tomb2[i] > n){
                break;
            }

            if(tomb2[i] == n){
                index = i;
                break; //ha az elemet megtaláltuk, akkor fölöslegesen már ne keressünk tovább. Így mindig az első előfordulását találja meg az elemnek.
            }
        }

        if(index != -1){ //ha az index értéke nem -1, akkor benne van
            System.out.println("A keresett elem sorszáma: "+(index+1));
        }
        else{ //az index értéke kizárólag akkor lehet -1, ha  tomb[i] == n feltétel 1x sem volt igaz. --> ez azt jelenti, hogy az n nem volt benne a tömbben
            System.out.println("A keresett elem nem található!");
        }

        //BINÁRIS KERESÉS
        //A lineáris keresés kizárólag rendezett tömbben tud keresni.

        System.out.println("BINÁRIS KERESÉS");
        int kezd = 0;
        int veg = tomb2.length-1;
        int kozep;

        index = -1;

        while(veg >= kezd){
            /*
            1. lépés:
            kezd = 0
            veg = 9
            kozep = (9+0)/2 -> 4

            tomb2[4] -> 1 --> jobb oldalon folytatjuk

            2. lépés:
            kezd = 5
            veg = 9
            kozep = (9+5)/2 -> 7

            tomb[7] -> 7  --> bal oldalon folytatjuk tovább

            3. lépés:
            kezd = 5
            veg = 6
            kozep = (6+5)/2 -> 5

            4. lépés:
            kezd = 6
            veg = 6
            kozep = 6

             */
            kozep = (veg+kezd)/2; //a középső elem indexe
            /*
            System.out.println("kezd: "+kezd);
            System.out.println("veg: "+veg);
            System.out.println("kozep: "+kozep);
            System.out.println("----------------------------");
            */

            System.out.println("Az aktuális elem: "+tomb2[kozep]);

            if(n == tomb2[kozep] ){
                index = kozep;
                break;
            }
            else if(n < tomb2[kozep]){ //csak a bal oldalon keresek
                veg = kozep - 1;
            }
            else{
                kezd = kozep + 1;
            }

        }

        if(index != -1){
            System.out.println("A keresett elem indexe: "+index);
        }
        else{
            System.out.println("A keresett nem nem található!");
        }


    }


}
