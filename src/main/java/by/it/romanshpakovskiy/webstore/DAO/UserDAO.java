package by.it.romanshpakovskiy.webstore.DAO;

import by.it.romanshpakovskiy.webstore.entities.User;

public interface UserDAO {
    User signIn(String login, String password);

    User registration(User user);

    boolean deleteUser(int userId, String password);

    boolean changePassword(int userId, String oldPassword, String newPassword);

    User getRegistrationData(int userId);
}
