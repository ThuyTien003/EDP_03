package bai3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DatabaseConnection {
    INSTANCE;

    private Connection connection;

    public void connect() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/qlnv";
                String user = "root";
                String password = "root";

                connection = DriverManager.getConnection(url, user, password);

                if (connection != null) {
                    System.out.println("Kết nối thành công!");
                } else {
                    System.out.println("Kết nối thất bại!");
                }
            } catch (SQLException e) {
                throw new RuntimeException("Không thể kết nối đến database", e);
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
