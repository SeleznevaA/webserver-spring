package ru.pflb.webserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pflb.webserver.RandomGenerator;
import ru.pflb.webserver.RandomNumber;

@RestController
public class RandomController {
    @RequestMapping(value = "/random", method = RequestMethod.POST)
    public RandomNumber random(@RequestParam(value = "from") int from, @RequestParam(value = "to")int to) {
        return new RandomNumber(from, to, new RandomGenerator(from, to).getRandom());
    }
}
