package ru.leonidromanov.Springboot.service;

import ru.leonidromanov.Springboot.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUser(int id);
    public void save(User user);
    public void update(User upUser);
    public void delete(int id);
}
