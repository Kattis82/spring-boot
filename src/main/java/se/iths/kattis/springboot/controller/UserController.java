package se.iths.kattis.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.springboot.model.User;
import se.iths.kattis.springboot.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String userList(Model model) {
        List<User> users = List.of(
                new User("kalu11", "1234", "kalu11@outlook.com"),
                new User("osca05", "5678", "oscar@outlook.com")

        );
        model.addAttribute("users", users);
        return "users";


    }
}
