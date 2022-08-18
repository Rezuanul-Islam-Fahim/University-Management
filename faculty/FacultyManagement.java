package faculty;

import java.util.Scanner;

public class FacultyManagement {
    public static void runFacultyOperation() {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            System.out.println("----- Manage Faculty -----");
            System.out.println("1. Add Faculty");
            System.out.println("2. Update Faculty");
            System.out.println("3. Search Faculty");
            System.out.println("4. Delete Faculty");
            System.out.println("5. Show All Faculty");
            System.out.println("6. Exit");

            switch (option) {
                case 1:
                    System.out.println("Add Faculty");
                    break;
                case 2:
                    System.out.println("Update Faculty");
                    break;
                case 3:
                    System.out.println("Search Faculty");
                    break;
                case 4:
                    System.out.println("Delete Faculty");
                    break;
                case 5:
                    System.out.println("Show All Faculty");
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
