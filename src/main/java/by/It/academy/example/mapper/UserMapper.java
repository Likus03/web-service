package by.It.academy.example.mapper;

import by.It.academy.example.entities.User;
import by.It.academy.example.utils.Constants;

import javax.servlet.http.HttpServletRequest;

public class UserMapper {

    public User builsUser(HttpServletRequest request){
        return User.builder()
                .firstname(request.getParameter(Constants.FIRSTNAME_PARAM))
                .surname(request.getParameter("surname"))
                .age(Integer.parseInt(request.getParameter("age")))
                .build(); //так нормальные люди делают!
    }
}
