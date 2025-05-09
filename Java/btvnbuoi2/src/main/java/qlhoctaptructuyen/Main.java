package qlhoctaptructuyen;

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();

        Instructor gv1 = new Instructor("GV01", "Mr. Hung", "hung@edu.com");
        Student sv1 = new Student("SV01", "Linh", "linh@gmail.com");
        Student sv2 = new Student("SV02", "Vuong", "vuong@gmail.com");

        lms.addUser(gv1);
        lms.addUser(sv1);
        lms.addUser(sv2);

        lms.loginAll(); //dang nhap

        // Tao khoa hoc va ghi danh
        Course javaCourse = gv1.createCourse("C001", "Java OOP");
        lms.addCourse(javaCourse);

        sv1.enrollCourse(javaCourse);
        sv2.enrollCourse(javaCourse);

        // diem
        gv1.gradeStudent(javaCourse, sv1, 8.5);
        gv1.gradeStudent(javaCourse, sv2, 9.0);

        lms.showAllGrades(); // xem bang diem

        // Xem diem ca nhan
        sv1.viewGrades();
        sv2.viewGrades();

        lms.logoutAll(); // dang xuat
    }
}

