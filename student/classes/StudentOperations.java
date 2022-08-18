package student.classes;

import java.util.Scanner;

import interfaces.GeneralOperations;

public class StudentOperations implements GeneralOperations {
    Student[] students;
    StudentIO studentIO;
    Scanner sc;

    public StudentOperations() {
        students = new Student[100];
        studentIO = new StudentIO();
        sc = new Scanner(System.in);
    }

    @Override
    public void add() {
        System.out.println("\n---- Enter Student Information ----");
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Gender(Male/Female): ");
        sc.nextLine();
        String gender = sc.nextLine();

        System.out.print("Cgpa: ");
        double cgpa = sc.nextDouble();

        System.out.print("Credit Passed: ");
        int creditPassed = sc.nextInt();

        Student newStudent = new Student(id, name, age, gender, cgpa, creditPassed);
        studentIO.writeIntoFile(newStudent);
        System.out.println("\n-----///----- New student added -----///-----");
        sc.nextLine();
    }

    @Override
    public void search() {
        System.out.print("\nEnter Student ID to search: ");
        String studentId = sc.nextLine();
        Student searchedStudent = studentIO.searchFromFile(studentId);
        if (searchedStudent.getId() == null) {
            System.out.println("No student found with this ID");
        } else {
            searchedStudent.showDetails();
        }
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

    @Override
    public void showAll() {
        // TODO Auto-generated method stub

    }
}
