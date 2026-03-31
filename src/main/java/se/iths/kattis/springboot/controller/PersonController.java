package se.iths.kattis.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.springboot.model.Person;
import se.iths.kattis.springboot.service.PersonService;
import se.iths.kattis.util.TextFormatter;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;
    private final TextFormatter textFormatter;

    public PersonController(PersonService personService, TextFormatter textFormatter) {
        this.personService = personService;
        this.textFormatter = textFormatter;
    }

    // http://localhost:8080/persons
    @GetMapping("/persons")
    public String personList(Model model) {      // @ResponseBody tas bort före String för att använda HTML istället
        List<Person> persons = List.of(
                new Person("20200727", "Oscar", 5, "oscarcalmvik@outlook.com"),
                new Person("20231010", "Soya", 2, "soya@soya.se")
        );
        List<Person> formattedPersons = persons.stream()
                .map(p -> new Person(
                        p.getId(),
                        textFormatter.textToUpper(p.getName()), // versaler
                        p.getAge(),
                        p.getEmail()
                ))
                .collect(Collectors.toList());

        model.addAttribute("persons", formattedPersons);
        return "persons";
    }
}
