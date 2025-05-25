package bai2_composite_3;

public class MenuItem implements MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public void show(String indent) {
        System.out.println(indent + "- " + name);
    }
}

