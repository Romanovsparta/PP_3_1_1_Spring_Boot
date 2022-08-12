package ru.leonidromanov.Springboot.dao;

import ru.leonidromanov.Springboot.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public User getUser(int id);
    public void save(User user);
    public void update(User upUser);
    public void delete(int id);
}
