package ciklusok;

public class ForCiklusOsszegzes {

    public static void main(String[] args) {

        //Írjon programot, mely az 1-20 közötti egész számok esetén megjelenítni az alábbiakat:
        //1. A számok összege
        //2. A számok szorzata
        //3. A páros számok összege

        int szum = 0; //a szum változóban fogjuk tárolni a számok összegét
        for (int i = 1; i < 21; i++) { //1-20 között járja be a számokat

            /*Példa: 1 2 3 4 5 .....
            szum = 0
            1. lépés: i = 1 --> szum = szum + i --> szum = szum + 1 --> szum = 0 + 1 --> szum = 1
            2. lépés: i = 2 --> szum = szum + i --> szum = szum + 2 --> szum = 1 + 2 --> szum = 3
            3. lépés: i = 3 --> szum = szum + i --> szum = szum + 3 --> szum = 3 + 3 --> szum = 6
            ......
            */

            szum = szum + i;  //szum+=i;

        }
        System.out.println("A számok összege: "+szum);


        long szorzat = 1; //a szorzat változóban fogjuk tárolni a számok szorzatát
        for (int i = 1; i < 21; i++) { //1-20 között járja be a számokat

            /*Példa: 1 2 3 4 5 .....
            szum = 0
            1. lépés: i = 1 --> szum = szum * i --> szum = szum * 1 --> szum = 1 * 1 --> szum = 1
            2. lépés: i = 2 --> szum = szum * i --> szum = szum * 2 --> szum = 1 * 2 --> szum = 2
            3. lépés: i = 3 --> szum = szum * i --> szum = szum * 3 --> szum = 2 * 3 --> szum = 6
            ......
            */

            szorzat = szorzat * i;  //szum+=i;

        }
        System.out.println("A számok szorzata: "+szorzat);


        szum = 0; //a szum változóban fogjuk tárolni a számok összegét
        for (int i = 1; i < 21; i++) { //1-20 között járja be a számokat

            //csak akkor fogjuk hozzáadni a szumhoz a i értékét, ha az páros
            if(i % 2 == 0){
                szum = szum + i;  //szum+=i;
            }

        }
        System.out.println("A páros számok összege: "+szum);

    }


}
