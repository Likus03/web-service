package by.It.academy.services;

import by.It.academy.entities.User;
import by.It.academy.repositories.UserRepository;
import by.It.academy.repositories.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository = new UserRepositoryImpl();
    public List<User> readUser() {
        return userRepository.readUser();
    }
}
