package bai3;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection instance = DatabaseConnection.INSTANCE;

        instance.connect();

        Connection conn = instance.getConnection();

        if (conn != null) {
            System.out.println("Đã lấy được kết nối từ DatabaseConnection singleton.");
            try {
                System.out.println("Connection is closed? " + conn.isClosed());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Kết nối chưa được thiết lập!");
        }

        DatabaseConnection connection1 = DatabaseConnection.INSTANCE;
        DatabaseConnection connection2 = DatabaseConnection.INSTANCE;

        System.out.println("connection1 == connection2: " + (connection1 == connection2));
    }
}
