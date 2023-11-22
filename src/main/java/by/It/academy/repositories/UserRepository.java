package by.It.academy.repositories;

import by.It.academy.entities.User;
import java.util.List;

public interface UserRepository {
    List<User> readUser();
}
