package com.generation;

import com.generation.classes.Student;
import com.generation.classes.StudentService;
import com.generation.exception.CourseNotFoundException;
import com.generation.exception.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        
        //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent(new Student("Carlos", "1030", 31));
        studentService.addStudent(new Student("Ian", "1020", 28));
        studentService.addStudent(new Student("Elise", "1050", 26));
        studentService.addStudent(new Student("Santiago", "1020", 33));


        try {
            studentService.enrollStudents("Math", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentService.enrollStudents("History", "1020");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        studentService.showAllCourses();
    }
}
