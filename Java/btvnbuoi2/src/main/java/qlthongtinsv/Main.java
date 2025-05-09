package qlthongtinsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        System.out.print("Nhap so luong sv: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sv thu: " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            Student s = new Student(id, name, age, gpa);
            studentList.add(s);
        }

        // Hiển thị SV GPA >= 3.2
        System.out.println("\nDS sv co GPA >= 3.2:");
        boolean found = false;
        for (Student s : studentList) {
            if (s.getGpa() >= 3.2) {
                s.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ko co sv nao co GPA >= 3.2");
        }

        // Sắp xếp theo GPA giảm dần
        studentList.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));

        System.out.println("\nDS sv sau khi sap xep theo GPA giam dan:");
        for (Student s : studentList) {
            s.display();
        }

        scanner.close();
    }

}
