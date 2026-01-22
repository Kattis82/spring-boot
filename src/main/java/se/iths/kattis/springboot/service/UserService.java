package se.iths.kattis.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String userFromService() {
        return "Hello from UserService!";
    }
}


