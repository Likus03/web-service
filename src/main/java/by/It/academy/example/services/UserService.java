package by.It.academy.example.services;

import by.It.academy.example.entities.User;

import java.util.List;

public interface UserService {
    List<User> readUser();

    User createUser(User user);
}
