package org.example.Challenge2;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Student> studentsToSchool = new ArrayList<>();
    //Step 3: Create a class "School" to which students can be added through a method ('addStudent').
    public void addStudent (Student student){
        studentsToSchool.add(student);
    }

    //Step 4: Implement a method to print all students of the school (as text, to the console).
    public void printAllStudents(){
        for (Student student:studentsToSchool){
            System.out.println(student);
        }
    }
    //Step 5: Add a method to find a student by their ID. The found student should be returned.


    //Step 6: Create a method to remove a student from the school.

}
