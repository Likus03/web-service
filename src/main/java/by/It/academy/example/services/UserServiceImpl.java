package by.It.academy.example.services;

import by.It.academy.example.entities.User;
import by.It.academy.example.repositories.UserRepository;
import by.It.academy.example.repositories.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository = UserRepositoryImpl.getInstance();
    private static UserService userService;

    private UserServiceImpl(){}
    public List<User> readUser() {
        return userRepository.readUser();
    }

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public static UserService getInstance(){

        if(userService == null){
            userService = new UserServiceImpl();
        }
        return userService;
    }
}
