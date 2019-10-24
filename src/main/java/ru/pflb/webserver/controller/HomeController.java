package ru.pflb.webserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/random")
    public String randomPage() {
        return "random";
    }

    @GetMapping("/counter")
    public String counterPage() {
        return "counter";
    }
}
