package oo;

import java.util.Scanner;

public class MainStudent {

/*
Készítsen programot, mely maximum 10 hallgató adatait dolgozza fel. A hallgatók adatait a standard bementről kapjuk meg a
következő formátumban: név;nem;születési év;neptun-kód;átlag.

A program írja a ki a standard kimenetre a legjobb átlaggal rendelkező hallgatók nevét.

Példa bemenet:
Nagy Gusztáv;true;1989;ABC123;4.56
Kovács János;true;1976;WEF341;3.4
Kiss Erika;false;1945;T45FK3;2.3
Kiss Erzsébet;false;2000;Q45KSW;3.89
*/

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        int counter = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            String[] array = line.split(";");
            Student student = new Student(array[0],Boolean.parseBoolean(array[1]),Integer.parseInt(array[2]),array[3],Double.parseDouble(array[4]));
            students[counter++] = student;

        }
        sc.close();

        for (int i = 0; i < counter; i++) {
            System.out.println(students[i]);
            //System.out.println("A hallgató neptun kódja: " + students[i].neptun);  --> a neptun privát elérésű, ezért nem tudok így hivatkozni rá.
            //System.out.println("A hallgató által kapott ösztöndíj összege: " + students[i].scholarshipAmount);
            System.out.println("A hallgató által kapott ösztöndíj összege: " + students[i].getScholarshipAmount());
        }
        System.out.println("A legjobb hallgató átlaga: " + Student.maxGpa(students,counter)); //mivel a maxGpa() metódus osztálymetódus, ezért a . előtt az osztály neve szerepel.

        System.out.println("============");
        Student student = new Student("Nagy Gusztáv",true,1989,"ABC123",4.56);
        student.setGpa(6);

    }

}
