package oo;

import java.util.Scanner;

public class MainPerson {

    /*
    A felhasználótól kérjünk be maximum 10 emberről szóló adatokat soronként állományvégjelig (EOF).
    Egy sor a következő formátumú: név;életkor;nem

    A név kizárólag az angol ábécé betűiből és szóköz karakterekből álló sztring.
    Az életkor egy egész szám. A nem szintén egy sztring, melynek lehetséges értékei: férfi/nő.

    A program írja ki azokat az embereket, akik idősek a beolvasásukkal ellentéses sorrendben. Egy embert idősnek tekintünk, ha 65 évnél idősebb.

    Példa bemenet:
Nagy Gusztáv;true;1989
Kovács János;true;1976
Kiss Erika;false;1945
Kiss Erzsébet;false;2000

    Kimenet:
    Kiss Erika
    Kovács János

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[10];
        int counter = 0;

        //nem tudjuk előre, hogy hány sort fog a felhasználó megadni -> while
        while(sc.hasNextLine()){ //hasNextLine() -> megmondja, hogy van-e még beolvasandó sor (EOF-ra áll le)
            String line = sc.nextLine(); //ha van beolvasandó sor, akkor olvassuk be

            //Egy sor egy-egy embert reprezentál. Minden ember a következő attribútumokkal rendelkezik:
            //1. név
            //2. életkor
            //3. nem
            //Ezeket az adatokat el kellene érni minden ember esetén --> a pontosvessző karakterek mentén kellene feldarabolni a sort
            //Javaban a split metódus segítségével fel tudunk szeletelni egy sztringet valamilyen elválasztó karakter(ek) mentén
            //A split metódus pedig visszaadja a szeleteket egy tömbben.
            String[] array = line.split(";");
            //System.out.println("Szeletek: " + Arrays.toString(tomb)); //Arrays.toString() a paraméterként kapott tömb elemeit sztringgé fűzi össze az alábbi formátumban:
            //[ elem_1, elem_2, ... , elem_n]

            //szövegesen tárolja az aktuális emberre vonatkozó adatokat
            //tomb[0] -> név
            //tomb[1] -> életkor
            //tomb[2] -> nem
            Person p = new Person(array[0],Boolean.parseBoolean(array[1]),Integer.parseInt(array[2]));
            people[counter++] = p;

            //people[counter] = p;
            //counter++;

        }
        sc.close();

        System.out.println("Emberek for ciklussal:");
        for (int i = 0; i < counter; i++) {
            System.out.println(people[i]);
        }
        System.out.println("Emberek for-each ciklussal:");
        for(Person p : people){ //p mindig az aktuális emberre vonatkozik. Nem használunk indexet.
            System.out.println(p);
        }

        System.out.println("===================");
        System.out.println("Idősek:");
        for (int i = counter-1; i >= 0 ; i--) {
            if(people[i].isOld()){
                System.out.println(people[i]);
            }
        }




    }

}
