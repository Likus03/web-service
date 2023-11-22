package by.It.academy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor //lombok
public class User {
    private String firstname;
    private String surname;
    private int age;
}
