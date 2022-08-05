package ru.leonidromanov.Springboot.service;

import ru.leonidromanov.Springboot.dao.UserDAO;
import org.springframework.stereotype.Component;
import ru.leonidromanov.Springboot.model.User;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(int id, User upUser) {
        userDAO.update(id, upUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
