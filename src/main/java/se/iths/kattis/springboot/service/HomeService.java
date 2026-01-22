package se.iths.kattis.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String helloFromService() {
        return "Hello from HomeService!";
    }
}
