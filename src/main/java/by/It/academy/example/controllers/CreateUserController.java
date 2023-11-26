package by.It.academy.example.controllers;

import by.It.academy.example.entities.User;
import by.It.academy.example.mapper.UserMapper;
import by.It.academy.example.repositories.UserRepository;
import by.It.academy.example.services.UserService;
import by.It.academy.example.services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/users/create")
public class CreateUserController extends HttpServlet {
    private static final String USERS_PAGE = "/example/pages/users/index.jsp";
    private final UserService userService = UserServiceImpl.getInstance();
    private final UserMapper userMapper = new UserMapper();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = userMapper.builsUser(req);
        userService.createUser(user);

        req.getRequestDispatcher("/users/read").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(USERS_PAGE).forward(req, resp);
    }
}
