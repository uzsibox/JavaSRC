package tombig;

public class Elso {

    //Ahhoz, hogy egy programot futtatni tudjunk, szükségünk van az ún. main metódusra.
    //Minden olyan utasítás, mely a main-ben van le fog futni.
    //Java-kód tulajdonképpen utasítások sorozatából áll.
    //Az utasításokat a futtatás során szekvenciálisan hatjuk végre.
    //Fontos: Minden Java utasítást pontosvessző zár!

    //Hozzuk létre a main metódust (IntelliJ-ben psvm+TAB rövidítéssel adható meg)
    public static void main(String[] args) {
        //A kapcsos zárójelek közötti utasítássorozatot blokknak nevezzük.
        //A program futtatása során minden utasítás, mely a main metódus blokkjában van le fog futni.

        //Írjunk egy olyan utasítást, mely a képernyőre írja a nevünket.
        //Java-ban erre a System.out.println() utasítást használhatjuk
        //rövidítés: sout+TAB
        System.out.println("Balogh Attila"); //A megjelenítendő dolgokat a zárójelen belülre kell írni idézőjelek között

    }

}
