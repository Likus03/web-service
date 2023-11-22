package by.It.academy.controllers;

import by.It.academy.entities.User;
import by.It.academy.services.UserService;
import by.It.academy.services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/users/read")
public class ReadUserController extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userService.readUser();

        req.setAttribute("users", users);
        req.getRequestDispatcher("/pages/users/users.jsp").forward(req, resp);
    }
}
