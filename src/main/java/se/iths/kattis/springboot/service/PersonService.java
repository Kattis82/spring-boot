package se.iths.kattis.springboot.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.springboot.model.Person;

@Service
public class PersonService {

    public Person createPerson() {
        return new Person("Kattis");
    }
}
