package faculty;

public class Faculty extends FacultyBase{
    private String name;
    private int id;
    private String department;

    public Faculty(String name,int id,String department){
        this.name=name;
        this.id=id;
        this.department=department;
    }
    @Override
    String getName() {
        return name;
    }

    @Override
    int getId() {
        return id;
    }

    @Override
    String getDepartment() {
        return department;
    }
    @Override
    void showDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: "+department);
    }
}
