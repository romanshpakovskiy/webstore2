package by.it.romanshpakovskiy.webstore.service.Impl;

import by.it.romanshpakovskiy.webstore.DAO.UserDAO;
import by.it.romanshpakovskiy.webstore.entities.User;
import by.it.romanshpakovskiy.webstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public User signIn(String login, String password) {
        return userDAO.signIn(login, password);
    }

    @Transactional
    @Override
    public User registration(User user) {
        return null;
    }

    @Transactional
    @Override
    public boolean deleteUser(int userId, String password) {
        return false;
    }

    @Transactional
    @Override
    public boolean changePassword(int userId, String oldPassword, String newPassword) {
        return false;
    }

    @Transactional
    @Override
    public User getRegistrationData(int userId) {
        return null;
    }
}
