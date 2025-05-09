package qlhoctaptructuyen;

import java.util.*;

public class LMS {
    private List<User> users = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void loginAll() {
        for (User u : users) {
            u.login();
        }
    }

    public void logoutAll() {
        for (User u : users) {
            u.logout();
        }
    }

    public void showAllGrades() {
        for (Course c : courses) {
            c.printGrades();
        }
    }
}

