package qlkhoahocnangcao;

import java.util.Objects;

public class Course {
    private String id;
    private String title;
    private int maxStudents;

    public Course(String id, String title, int maxStudents) {
        this.id = id;
        this.title = title;
        this.maxStudents = maxStudents;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getMaxStudents() { return maxStudents; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id.equals(course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " - " + title + " (Tối đa: " + maxStudents + " SV)";
    }
}
