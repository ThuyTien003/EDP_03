package qlhoctaptructuyen;

import java.util.*;

public class Course {
    private String courseId;
    private String title;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();
    private Map<Student, Double> grades = new HashMap<>();

    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setGrade(Student student, double grade) {
        if (students.contains(student)) {
            grades.put(student, grade);
        }
    }

    public Double getGrade(Student student) {
        return grades.get(student);
    }

    public void printGrades() {
        System.out.println("Bang diem khoa hoc: " + title);
        for (Student s : students) {
            Double g = grades.get(s);
            System.out.println(" - " + s.name + ": " + (g != null ? g : "Chua co diem"));
        }
    }
}
