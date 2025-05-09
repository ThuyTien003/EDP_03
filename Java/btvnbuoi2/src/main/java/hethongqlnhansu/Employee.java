package hethongqlnhansu;

public abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }

}
