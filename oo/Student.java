package oo;

public class Student extends Person{

    //Öröklődés: az újrahasznosíthatóság növelése érdekében egyes osztályokban megírt adattagokat és metódusokat használhatjuk másik osztálynál is.
    //Egy gyerekosztály (leszármazott) örökli a szülőosztály (szuperosztály) minden adattagját és metódusát.
    //Újakat is definiálhat, valamint a régieket felülírhatja.

    //új adattagok
    private String neptun;
    private double gpa;
    private int scholarshipAmount;

    //Láthatósági módosítók:
    //public: mindenhol látható
    //default: csak az adott csomagon belül látható
    //protected: csak az adott osztályon és az ő gyerekein belül látható
    //private: csak osztályon belül látható


    public Student(String name, boolean sex, int birthYear, String neptun, double gpa) {
        super(name, sex, birthYear); //super() meghívja a szülőosztály konstruktorát, tehát "elkészít egy Person objektumot, majd a maradék adattagot is hozzáteszi".
        this.neptun = neptun;
        this.gpa = gpa;
        this.scholarshipAmount = getScholarship();
    }

    public int getScholarship(){
        if(gpa >= 4){
            return 30000;
        }
        else if(gpa >= 3){
            return 20000;
        }
        return 0;
    }

    //override = felülírja a szülőosztály metódusát. Ilyenkor a metódusnak pontosan ugyanolyan specifikációval kell rendelkeznie (név+paraméter lista)
    @Override
    public boolean isOld(){
        System.out.println("Student osztály isOld() metódusa");
        return age >= 40;
    }

    @Override
    public String toString() {
        //super.toString() meghívja a szülő toString() metódusát.
        return super.toString() + " átlag: " + gpa;
    }

    //getter -> az adott adattag értékét adja vissza
    public double getGpa() {
        return gpa;
    }

    //setter -> az adott adattag értékét beállítja egy kívánt értékre
    //a set segítségével hibakezelést is tudunk beletenni. Ha set nélkül is tudnánk módosítani, akkor akár rossz értéket is megadhatnánk.
    public void setGpa(double x) {
        if(x < 1 || x > 5){
            System.err.println("Hibás érték!");
            this.gpa = 0;
        }
        this.gpa = gpa;
    }

    //Mivel az ösztöndíjhoz nincs set metódus ezért ezt csak olvasni tudjuk.
    public int getScholarshipAmount() {
        return scholarshipAmount;
    }


    //Írjunk függvényt, mely paraméterként kap egy hallgatókat tartalmazó egydimenziós tömböt és méretét majd visszaadja a legjobb hallgató átlagát.
    //static -> osztálymetódus: nem egy konktrét példányra vonatkozik és emiatt nem egy-egy példány adattagjaival dolgozik. (A this szó nem jelenik meg itt).
    public static double maxGpa(Student[] array, int size){
        double max = array[0].getGpa();
        for (int i = 1; i < size; i++) {
            if(array[i].getGpa() > max){
                max = array[i].getGpa();
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Student student = new Student("Kiss Géza",true,1995,"ABC123",4.56);
        Student student2 = new Student("Kiss Lajos",true,1970,"ADC123",4.06);
        System.out.println(student);
        System.out.println(student.isOld());
        System.out.println(student2);
        System.out.println(student2.isOld());
        System.out.println(student2.isOld(32));

    }

}
