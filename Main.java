import java.util.Scanner;

import faculty.FacultyManagement;
import student.StudentManagement;
import stuff.StuffManagement;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n============///==== Welcome to University Management System ====///============\n");
        System.out.println("1. Faculty Management");
        System.out.println("2. Student Management");
        System.out.println("3. Stuff Management");
        System.out.print("\nSelect Option: ");

        int managementOption = sc.nextInt();

        switch (managementOption) {
            case 1:
                FacultyManagement.runFacultyOperation();
                break;
            case 2:
                StudentManagement.runStudentOperation();
                break;
            case 3:
                StuffManagement.runStuffOperation();
                break;
            default:
                System.out.println("Unknown Operation");
        }

        sc.close();
    }
}