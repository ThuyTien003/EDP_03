package bai1_composite_3;

public class Employee implements EmployeeComponent {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showDetails(String indent) {
        System.out.println(indent + "- " + position + ": " + name);
    }
}

