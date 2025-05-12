package B1_dkkhoahoc;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    private List<Student> students;

    public Course(int courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String newName) {
        this.courseName = newName;
    }


    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printStudents() {
        System.out.println("DS sv trong khoa hoc \"" + courseName + "\":");
        if (students.isEmpty()) {
            System.out.println("KO co sv ");
        } else {
            for (Student s : students) {
                System.out.println(" " + s.getName());
            }
        }
    }
}
