package org.example;

import org.example.Challenge2.School;
import org.example.Challenge2.Student;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Session2:

        //Arrays haben eher Nachteile, insbesondere wenn man diese bearbeiten möchte
        int[] ints = new int[2];
        int[] ints2 = {1,2,3};

        //List -> Das Java.Interface
        //Liste ist getuneter Array
        // <> stellt "Geschmacksrichtung" der Liste dar, es können keine primitiven Variablen abgespeichert

        //Wrapper Klassen (macht aus primitiven Datentypen komplexe) -> z.B. aus "int" wird "Integer"
        List<Integer> integers = new ArrayList<>(); //erstellt: new Integer [0]

        //Daten zur Liste hinzufügen:
        integers.add(1); //new Integer [1], Integer[0] = {1};
        integers.add(5);
        integers.add(3);

        //Daten aus der Liste entfernen:
        integers.remove(Integer.valueOf(5));

        //Daten hinzufügen an einer bestimmten Stelle:
        integers.add(2,100);

        //Size == length der Liste
        int size = integers.size();

        //Get Data:
        Integer x = integers.get(2);

        for (int i=0;i<integers.size();i++){
        //Durch i wachsender indexinteger möglich um z.B. Daten zu laden
        }
        //for each Schleife: braucht man keinen Zähler (i) reicht die for each Schleife bzw. nur zum Auszählen
        //Syntax: for(Vorübergehende Variable : Sammlung die durchsucht werden soll){ }
        for (Integer currywurst:integers){
            System.out.println(currywurst);
        }
        System.out.println("Ab hier Challenge2");
        //Challenge2:

        //Step 2: Create a Java List for elements of type "Student" and add multiple students.
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ferdinand","Speer","S001"));
        students.add(new Student("Stephen","King","S002"));
        students.add(new Student("Harry","Potter","S003"));
        students.add(new Student("James","Bond","S007"));

        System.out.println("_____________________________");
        //Step 4: Implement a method to print all students of the school (as text, to the console).
        School school = new School();

        school.addStudent(new Student("Ferdinand","Speer","S001"));
        school.addStudent(new Student("Stephen","King","S002"));
        school.addStudent(new Student("Harry","Potter","S003"));
        school.addStudent(new Student("James","Bond","S007"));

        school.printAllStudents();

        //Find a Student by studentID:
        school.findStudentByID("S003");

        //Remove a Student:
        school.removeStudent(new Student("Harry","Potter","S003"));

    }

}