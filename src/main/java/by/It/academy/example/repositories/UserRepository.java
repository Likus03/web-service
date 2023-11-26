package by.It.academy.example.repositories;

import by.It.academy.example.entities.User;
import java.util.List;

public interface UserRepository {

    List<User> readUser();

    User createUser(User user);
}
