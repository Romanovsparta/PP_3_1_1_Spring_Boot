package ru.leonidromanov.Springboot.service;

import ru.leonidromanov.Springboot.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    @Transactional(readOnly = true)
    public List<User> getAllUsers();
    @Transactional(readOnly = true)
    public User getUser(int id);
    public void save(User user);
    public void update(int id, User upUser);
    public void delete(int id);
}
