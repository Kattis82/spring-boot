package se.iths.kattis.springboot.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.springboot.model.User;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return List.of(
                new User("kalu11", "1234", "kalu11@outlook.com"),
                new User("osca05", "5678", "oscar@outlook.com")

        );
    }
}


