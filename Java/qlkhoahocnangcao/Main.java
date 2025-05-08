package qlkhoahocnangcao;

import java.time.LocalDate;
import java.util.*;

public class Main {
    static List<Student1> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static List<Enrollment> enrollments = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCHON");
            System.out.println("1. them sv");
            System.out.println("2. them khoa hoc");
            System.out.println("3. dang ky khoa hoc");
            System.out.println("4. in sv cua khoa hoc (sap xep theo ngay dang ky)");
            System.out.println("5. in khoa hoc cua sv");
            System.out.println("6. thong ke: khoa hoc nhieu sv nhat");
            System.out.println("7. thong ke: sv dk nhieu khoa hoc nhat");
            System.out.println("0. thoat");
            System.out.print("chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addStudent(scanner);
                case 2 -> addCourse(scanner);
                case 3 -> enrollStudent(scanner);
                case 4 -> printStudentsByCourse(scanner);
                case 5 -> printCoursesByStudent(scanner);
                case 6 -> mostEnrolledCourse();
                case 7 -> mostActiveStudent();
                case 0 -> System.out.println("ket thuc.");
                default -> System.out.println("ko hop le.");
            }

        } while (choice != 0);
    }

    static void addStudent(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Ten: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        students.add(new Student1(id, name, email));
    }

    static void addCourse(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Tieu de: ");
        String title = sc.nextLine();
        System.out.print("So sv toi da: ");
        int max = Integer.parseInt(sc.nextLine());
        courses.add(new Course(id, title, max));
    }

    static void enrollStudent(Scanner sc) {
        System.out.print("ID sv: ");
        String studentId = sc.nextLine();
        System.out.print("ID khoa hoc: ");
        String courseId = sc.nextLine();

        Student1 student = findStudentById(studentId);
        Course course = findCourseById(courseId);

        if (student == null || course == null) {
            System.out.println("Ko tim thay sv hoac khoa hoc.");
            return;
        }

        long count = enrollments.stream()
                .filter(e -> e.getCourse().equals(course)).count();

        boolean alreadyEnrolled = enrollments.stream()
                .anyMatch(e -> e.getStudent().equals(student) && e.getCourse().equals(course));

        if (count >= course.getMaxStudents()) {
            System.out.println("Khoa hoc da du sl.");
        } else if (alreadyEnrolled) {
            System.out.println("sv da dk khoa hoc nay.");
        } else {
            enrollments.add(new Enrollment(student, course, LocalDate.now()));
            System.out.println("dk thanh cong.");
        }
    }

    static void printStudentsByCourse(Scanner sc) {
        System.out.print("ID khoa hoc: ");
        String courseId = sc.nextLine();
        Course course = findCourseById(courseId);

        if (course == null) {
            System.out.println("Ko tim thay khoa hoc.");
            return;
        }

        List<Enrollment> list = enrollments.stream()
                .filter(e -> e.getCourse().equals(course))
                .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
                .toList();

        System.out.println("ds sv:");
        list.forEach(e -> System.out.println(e.getStudent() + " - " + e.getEnrollmentDate()));
    }

    static void printCoursesByStudent(Scanner sc) {
        System.out.print("ID sv: ");
        String studentId = sc.nextLine();
        Student1 student = findStudentById(studentId);

        if (student == null) {
            System.out.println("Ko tim thay sv.");
            return;
        }

        List<Enrollment> list = enrollments.stream()
                .filter(e -> e.getStudent().equals(student))
                .toList();

        System.out.println("Khoa hoc da dk:");
        list.forEach(e -> System.out.println(e.getCourse()));
    }

    static void mostEnrolledCourse() {
        Map<Course, Long> countMap = new HashMap<>();
        for (Enrollment e : enrollments) {
            countMap.put(e.getCourse(), countMap.getOrDefault(e.getCourse(), 0L) + 1);
        }

        countMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println("Khoa hoc nhieu sv nhat: " + e.getKey() + " - " + e.getValue() + " sv"));
    }

    static void mostActiveStudent() {
        Map<Student1, Long> countMap = new HashMap<>();
        for (Enrollment e : enrollments) {
            countMap.put(e.getStudent(), countMap.getOrDefault(e.getStudent(), 0L) + 1);
        }

        countMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println("sv dk nhieu khoa hoc nhat: " + e.getKey() + " - " + e.getValue() + " khoa hoc"));
    }

    static Student1 findStudentById(String id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    static Course findCourseById(String id) {
        return courses.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }
}
