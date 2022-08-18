package student.classes;

public class Student extends StudentBase {
    private String id;
    private String name;
    private int age;
    private String gender;
    private double cgpa;
    private int creditPassed;

    public Student(String id, String name, int age, String gender, double cgpa, int creditPassed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cgpa = cgpa;
        this.creditPassed = creditPassed;
    }

    @Override
    String getId() {
        return id;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getAge() {
        return age;
    }

    @Override
    String getGender() {
        return gender;
    }

    @Override
    double getCGPA() {
        return cgpa;
    }

    @Override
    int getCreditPassed() {
        return creditPassed;
    }

    @Override
    void showDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credit Passed: " + creditPassed);
    }
}
