package qlkhoahocnangcao;

import java.time.LocalDate;

public class Enrollment {
    private Student1 student;
    private Course course;
    private LocalDate enrollmentDate;

    public Enrollment(Student1 student, Course course, LocalDate enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student1 getStudent() { return student; }
    public Course getCourse() { return course; }
    public LocalDate getEnrollmentDate() { return enrollmentDate; }

    @Override
    public String toString() {
        return student.getName() + " - " + enrollmentDate;
    }
}
