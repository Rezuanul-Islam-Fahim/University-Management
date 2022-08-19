package faculty;
import java.util.Scanner;

import interfaces.GeneralOperations;
public class FacultyOperations implements GeneralOperations {
    FacultyIO facultyIO;
    Scanner sc;

    public FacultyOperations() {
        facultyIO = new FacultyIO();
        sc = new Scanner(System.in);
    }

    @Override
    public void add() {
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Department: ");
        int department = sc.nextInt();

        Faculty newFaculty = new Faculty(name,id,department);
        facultyIO.writeIntoFile(newFaculty);
        System.out.println("\n-----///----- New Faculty added -----///-----");
        sc.nextLine();
    }

    @Override
    public void search() {
        System.out.print("\nEnter Faculty ID to search: ");
        String facultyId = sc.nextLine();
        Faculty faculty = facultyIO.searchFromFile(facultyId);
        if (Faculty.getId() == null) {
            System.out.println("No Faculty found with this ID");
        } else {
            faculty.showDetails();
        }

    }

    @Override
    public void update() {
        System.out.print("\nEnter faculty ID to update: ");
        String facultyId = sc.nextLine();
        Faculty faculty = facultyIO.searchFromFile(facultyId);
        if (faculty.getId() == null) {
            System.out.println("No faculty found with this ID");
        } else {
            String facultyStr = faculty.facultyToStr();
            System.out.println("\n---- Edit Student Information ----");

            System.out.print("Name (" + faculty.getName() + "): ");
            String name = sc.nextLine();


            System.out.print("Gender (" + faculty.getDepartment() + "): ");
            String department = sc.nextLine();

            Faculty updatedFaculty = new Faculty(
                    faculty.getId(),
                    name == "" ? faculty.getName() : name,
                    department == "" ? faculty.getDepartment() : department,
            String updatedFacultyStr = updatedFaculty.facultyToStr();
            facultyIO.updateData(facultyStr, updatedFacultyStr);
            System.out.println("\n-----///----- Student data updated -----///-----");
        }
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
