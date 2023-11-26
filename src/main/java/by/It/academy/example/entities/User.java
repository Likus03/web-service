package by.It.academy.example.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor //lombok
public class User {
    private Long id;
    private String firstname;
    private String surname;
    private int age;
}
