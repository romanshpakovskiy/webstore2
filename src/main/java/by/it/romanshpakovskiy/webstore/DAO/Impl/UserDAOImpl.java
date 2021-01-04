package by.it.romanshpakovskiy.webstore.DAO.Impl;

import by.it.romanshpakovskiy.webstore.DAO.UserDAO;
import by.it.romanshpakovskiy.webstore.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
    private static final String EMAIL_PARAMETER = "email";
    private static final String PSW_PARAMETER="password";
    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User signIn(String email, String password) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery("FROM User WHERE User.email=:email AND User.password=:password", User.class);
        query.setParameter(EMAIL_PARAMETER, email);
        query.setParameter(PSW_PARAMETER, password);
        return query.getSingleResult();
    }

    @Override
    public User registration(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(int userId, String password) {
        return false;
    }

    @Override
    public boolean changePassword(int userId, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public User getRegistrationData(int userId) {
        return null;
    }
}
