package se.iths.kattis.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.springboot.model.Person;
import se.iths.kattis.springboot.service.PersonService;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    
    // http://localhost:8080/persons
    @GetMapping("/persons")
    public String personList(Model model) {      // @ResponseBody tas bort före String för att använda HTML istället
        List<Person> persons = List.of(
                new Person("20200727", "Oscar", 5, "oscarcalmvik@outlook.com"),
                new Person("20231010", "Soya", 2, "soya@soya.se")
        );
        model.addAttribute("persons", persons);
        return "persons";
    }
}
