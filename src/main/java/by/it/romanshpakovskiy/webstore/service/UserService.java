package by.it.romanshpakovskiy.webstore.service;

import by.it.romanshpakovskiy.webstore.entities.User;

public interface UserService {
    User signIn(String login, String password);

    User registration(User user);

    boolean deleteUser(int userId, String password);

    boolean changePassword(int userId, String oldPassword, String newPassword);

    User getRegistrationData(int userId);
}
