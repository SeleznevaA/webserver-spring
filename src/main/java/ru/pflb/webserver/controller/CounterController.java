package ru.pflb.webserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pflb.webserver.controller.dto.Counter;

@RestController
public class CounterController {

    private Integer current;

    @RequestMapping(value = "/counter", method = RequestMethod.POST)
    public Counter counter(@RequestParam(value = "start value") int start, @RequestParam(value = "counter value")int counter) {
        if (current == null) {
            current = start;
        }
        current += counter;
        return new Counter(start, counter, current);
    }

    @RequestMapping(value = "/new-counter", method = RequestMethod.GET)
    public void newCounter() {
        current = null;
    }
}
