package student;

import java.util.Scanner;

public class StudentManagement {
    public static void runStudentOperation() {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            System.out.println("----- Manage Student -----");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Show All Student");
            System.out.println("6. Exit");

            switch (option) {
                case 1:
                    System.out.println("Add Student");
                    break;
                case 2:
                    System.out.println("Update Student");
                    break;
                case 3:
                    System.out.println("Search Student");
                    break;
                case 4:
                    System.out.println("Delete Student");
                    break;
                case 5:
                    System.out.println("Show All Student");
                    break;
                case 6:
                    System.out.println("Program Exited");
                    break;
                default:
                    System.out.println("Invalid Input");
            }

            option = sc.nextInt();
        }

        sc.close();
    }
}
