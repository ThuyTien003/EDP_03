package hethongqlUSER.UI;

import hethongqlUSER.DAO.UserDAOImpl;
import hethongqlUSER.Service.UserService;
import hethongqlUSER.models.User;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static UserService service;

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management", "root", "root");
        service = new UserService(new UserDAOImpl(conn));

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Tìm kiếm người dùng");
            System.out.println("4. Đổi mật khẩu");
            System.out.println("5. Danh sách người dùng");
            System.out.println("6. Xóa người dùng");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> register();
                case 2 -> login();
                case 3 -> search();
                case 4 -> changePassword();
                case 5 -> listUsers();
                case 6 -> deleteUser();
            }
        } while (choice != 0);
    }

    static void register() throws Exception {
        User u = new User();
        System.out.print("Họ tên: ");
        u.setFullName(scanner.nextLine());
        System.out.print("Email: ");
        u.setEmail(scanner.nextLine());
        System.out.print("Mật khẩu: ");
        u.setPassword(scanner.nextLine());
        System.out.print("Điện thoại: ");
        u.setPhone(scanner.nextLine());
        System.out.print("Địa chỉ: ");
        u.setAddress(scanner.nextLine());
        System.out.print("Ngày sinh (yyyy-MM-dd): ");
        u.setBirthDay(new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine()));
        u.setRole("user");

        if (service.register(u)) System.out.println("Đăng ký thành công!");
        else System.out.println("Email đã tồn tại!");
    }

    static void login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Mật khẩu: ");
        String pass = scanner.nextLine();

        User user = service.login(email, pass);
        if (user != null) System.out.println("Đăng nhập thành công!");
        else System.out.println("Sai thông tin đăng nhập!");
    }

    static void search() {
        System.out.print("Nhập tên hoặc email cần tìm: ");
        String keyword = scanner.nextLine();
        List<User> users = service.searchUser(keyword);
        users.forEach(u -> System.out.println(u.getFullName() + " | " + u.getEmail()));
    }

    static void changePassword() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Mật khẩu cũ: ");
        String oldPass = scanner.nextLine();
        System.out.print("Mật khẩu mới: ");
        String newPass = scanner.nextLine();

        if (service.changePassword(email, oldPass, newPass)) System.out.println("Đổi mật khẩu thành công.");
        else System.out.println("Sai mật khẩu cũ!");
    }

    static void listUsers() {
        service.getAllUsers().forEach(u -> System.out.println(u.getId() + " | " + u.getFullName() + " | " + u.getEmail()));
    }

    static void deleteUser() {
        System.out.print("Email cần xóa: ");
        String email = scanner.nextLine();
        if (service.deleteUser(email)) System.out.println("Xóa thành công.");
        else System.out.println("Không tìm thấy người dùng.");
    }
}

