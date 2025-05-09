package hethongqlnhansu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Nhap so luong nhan vien: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhan vien thu " + (i + 1));
            System.out.print("Loai (1 - FullTime, 2 - PartTime): ");
            int type = Integer.parseInt(scanner.nextLine());

            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (type == 1) {
                System.out.print("Luong cb: ");
                double salary = Double.parseDouble(scanner.nextLine());
                employees.add(new FullTimeEmployee(id, name, salary));
            } else {
                System.out.print("Gio lam viec: ");
                int hours = Integer.parseInt(scanner.nextLine());
                System.out.print("Luong theo gio: ");
                double rate = Double.parseDouble(scanner.nextLine());
                employees.add(new PartTimeEmployee(id, name, hours, rate));
            }
        }

        System.out.println("\nDanh sach nhan vien");
        double totalSalary = 0;
        for (Employee emp : employees) {
            emp.display();
            totalSalary += emp.calculateSalary();
        }

        System.out.println("\nTong luong cong ty phai tra: " + totalSalary);
        scanner.close();
    }

}
