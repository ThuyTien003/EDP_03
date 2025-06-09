package hethongqlUSER.DAO;

import hethongqlUSER.models.User;
import java.util.*;

public interface UserDAO {
    User findByEmail(String email);
    boolean save(User user);
    List<User> searchByName(String keyword);
    boolean updatePassword(String email, String newPassword);
    boolean deleteByEmail(String email);
    List<User> findAll();
}

