package bai1_composite_3;

import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private String name;
    private String position;
    private List<EmployeeComponent> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(EmployeeComponent e) {
        subordinates.add(e);
    }

    public void remove(EmployeeComponent e) {
        subordinates.remove(e);
    }

    public void showDetails(String indent) {
        System.out.println(indent + "+ " + position + ": " + name);
        for (EmployeeComponent e : subordinates) {
            e.showDetails(indent + "    ");
        }
    }
}

