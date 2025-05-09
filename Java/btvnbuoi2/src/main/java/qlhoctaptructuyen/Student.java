package qlhoctaptructuyen;

import java.util.*;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewGrades() {
        for (Course course : enrolledCourses) {
            Double grade = course.getGrade(this);
            System.out.println("Mon: " + course.getTitle() + ", Điem: " + (grade != null ? grade : "Chua co diem"));
        }
    }

    @Override
    public void login() {
        System.out.println("Hoc vien " + name + " da dang nhap");
    }

    @Override
    public void logout() {
        System.out.println("Hoc vien " + name + " da dang xuat");
    }
}

