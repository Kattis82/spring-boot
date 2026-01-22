package se.iths.kattis.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.springboot.service.HomeService;

// nu kan den ta emot Http anrop, multitrådning och flera saker när vi startar servern
@Controller
@RequestMapping("/")
public class HomeController {
    // HomeController använder HomeService via dependency injection
    // genom att lägga till klass-attribut och en konstruktor sätter vi ihop två
    // klasser mha DI
    private final HomeService homeService;


    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }


    @GetMapping
    public String home(Model model) {      // @ResponseBody tas bort före String för att använda HTML istället
        model.addAttribute("name", "Kattis");
        return "index";
    }
}
