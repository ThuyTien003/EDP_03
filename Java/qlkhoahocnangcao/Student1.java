package qlkhoahocnangcao;

import java.util.Objects;

public class Student1 {
    private String id;
    private String name;
    private String email;

    public Student1(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student1)) return false;
        Student1 student = (Student1) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + email + ")";
    }
}
