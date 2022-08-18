package stuff;

import java.util.Scanner;

public class StuffManagement {
    public static void runStuffOperation() {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            System.out.println("----- Manage Stuff -----");
            System.out.println("1. Add Stuff");
            System.out.println("2. Update Stuff");
            System.out.println("3. Search Stuff");
            System.out.println("4. Delete Stuff");
            System.out.println("5. Show All Stuff");
            System.out.println("6. Exit");

            switch (option) {
                case 1:
                    System.out.println("Add Stuff");
                    break;
                case 2:
                    System.out.println("Update Stuff");
                    break;
                case 3:
                    System.out.println("Search Stuff");
                    break;
                case 4:
                    System.out.println("Delete Stuff");
                    break;
                case 5:
                    System.out.println("Show All Stuff");
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
