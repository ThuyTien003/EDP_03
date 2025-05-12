package B1_dkkhoahoc;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1, "Mr. Hung");

        Course courseJava = new Course(101, "lap trinh java", instructor1);
        Course courseIOS = new Course(102, "lap trinh iOS", instructor1);

        Student s1 = new Student(1, "Tien");
        Student s2 = new Student(2, "Linh");

        s1.registerCourse(courseJava);
        s1.registerCourse(courseIOS);
        s2.registerCourse(courseJava);

        courseJava.printStudents();
        courseIOS.printStudents();

        System.out.println();
        s1.printCourses();

        System.out.println("\nDoi ten khoa hoc 'lap trinh java' thanh 'java oop' ");
        courseJava.setCourseName("Java OOP");
        System.out.println("\nDS sv sau khi doi ten khoa hoc: ");

        System.out.println("\nXoa Linh khoi khoa hoc lap trinh ios");
        s2.removeCourse(courseJava);

        System.out.println("\nDS sau khi xoa: ");
        courseJava.printStudents();
    }
}
