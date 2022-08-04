package ru.leonidromanov.Springboot.service;

import org.springframework.stereotype.Component;
import ru.leonidromanov.Springboot.model.User;
import ru.leonidromanov.Springboot.repository.UserRepository;

import java.util.List;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        return userRepository.getReferenceById(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
