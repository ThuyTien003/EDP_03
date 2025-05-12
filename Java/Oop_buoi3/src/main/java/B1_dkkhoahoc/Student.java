package B1_dkkhoahoc;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> courses;

    public Student(int id, String name) {
        super(id, name);
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeStudent(this);
        }
    }

    public void printCourses() {
        System.out.println("cac khoa hoc cua sv " + name + ":");
        for (Course c : courses) {
            System.out.println(" " + c.getCourseName());
        }
    }
}
