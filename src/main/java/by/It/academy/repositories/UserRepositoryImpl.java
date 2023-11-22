package by.It.academy.repositories;

import by.It.academy.entities.User;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private final List<User> users = List.of(
            new User("Dmitriy", "Steba", 39),
            new User("Anzhelika", "Pivovar", 20)
    );
    @Override
    public List<User> readUser() {
        return users;
    }
}
