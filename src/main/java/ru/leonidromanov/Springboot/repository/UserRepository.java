package ru.leonidromanov.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.leonidromanov.Springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
