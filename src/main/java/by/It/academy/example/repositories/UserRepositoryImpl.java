package by.It.academy.example.repositories;

import by.It.academy.example.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    private static UserRepository userRepository;
    private final List<User> users = new ArrayList<>();
    private UserRepositoryImpl(){}
    @Override
    public List<User> readUser() {
        return users;
    }

    @Override
    public User createUser(User user) {
        user.setId((long) users.size() + 1);
        users.add(user);
        return user;
    }

    public static UserRepository getInstance(){
        if(userRepository == null){
            userRepository = new UserRepositoryImpl();
        }
        return userRepository;
    }
}
