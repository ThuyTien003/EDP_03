package hethongqlUSER.Service;

import hethongqlUSER.DAO.UserDAO;
import hethongqlUSER.PasswordHasher;
import hethongqlUSER.models.User;

import java.util.List;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO dao) {
        this.userDAO = dao;
    }

    public boolean register(User user) {
        if (userDAO.findByEmail(user.getEmail()) != null) return false;
        user.setPassword(PasswordHasher.hash(user.getPassword()));
        return userDAO.save(user);
    }

    public User login(String email, String password) {
        User user = userDAO.findByEmail(email);
        if (user != null && user.getPassword().equals(PasswordHasher.hash(password))) {
            return user;
        }
        return null;
    }

    public boolean changePassword(String email, String oldPass, String newPass) {
        User user = userDAO.findByEmail(email);
        if (user != null && user.getPassword().equals(PasswordHasher.hash(oldPass))) {
            return userDAO.updatePassword(email, PasswordHasher.hash(newPass));
        }
        return false;
    }

    public List<User> searchUser(String keyword) {
        return userDAO.searchByName(keyword);
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public boolean deleteUser(String email) {
        return userDAO.deleteByEmail(email);
    }
}

