package se.iths.kattis.springboot.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.springboot.model.Person;
import se.iths.kattis.util.TextFormatter;

@Service
public class PersonService {

    private final TextFormatter textFormatter;

    public PersonService(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public Person createPerson() {
        return new Person("Kattis");
    }


}
