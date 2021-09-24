package ciklusok;

public class Ciklusok {

    /*
    Írjon programot, mely a képernyőre írja a saját nevét tízszer.
     */

    public static void main(String[] args) {

        /*
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        System.out.println("Balogh Attila");
        */

        //A fenti megoldás túl hosszú kódot eredményez. Tulajdonképpen egy utasításra van nekünk szükségünk (println)
        //Ezt kellene elvégezni 10x.
        //A ciklusok egy-egy utasítássoroztatot hajtanak végre többször.
        //Az, hogy egy sorozat hányszor fut le a ciklus típusától függ.
        //1. for -> előre megadhatjuk, hogy hányszor fusson le
        //2. while -> nem tudjuk előre, hogy hányszor fog lefutni. Addig hatjuk végre az utasításokat, amíg egy bizonyos feltétel igaz.

        //A fenti feladatot for ciklus segítségével is megoldhatjuk.
        //A println utasítást kellene 10x lefuttatni.
        //For ciklus általános alakja:
        /*
        for(kezdő;utolsó;lépésköz){
            utasítások;
        }
        Mindig lesz egy ún. ciklusváltozónk, amelynek értéke a ciklus futása során változik.
        Kezdőértéke a "kezdő" lesz, és az utolsó értéke pedig az "utolsó"
        Minden lépésben az értékét változtatjuk (a lépésköz határozza meg, hogy mennyivel változik)

        A ciklusváltozó fogja meghatározni, hogy hányszor fog lefutni a ciklus: utolsó-kezdő + 1

        */
        System.out.println("-----------FOR--------------");
        for(int i = 1; i<=10; i++){  //a ciklusváltozó a cikluson belül van dekralálva. Ez azt jelenti, hogy az i változóra kizárólag
                                     //a for ciklus blokkján belül hivatkozhatunk (a két kapcsos között)
            //kezdő: 1
            //utolsó: 10
            //lépésköz: +1
            System.out.println("Balogh Attila");
        }
        //Itt az i értékére már nem lehet hivatkozni.
        //System.out.println(i);

        //while ciklussal

        /*
        while(feltétel){
            utasítok;
        }


         */
        System.out.println("------------WHILE----------");
        int j = 1; //ciklusváltozó kezdőértékkel
        while(j<=10){ //feltétel
            System.out.println("Balogh Attila");
            j++; //léptetés
        }

        //Rövidítések: for+TAB vagy fori+TAB





    }



}
