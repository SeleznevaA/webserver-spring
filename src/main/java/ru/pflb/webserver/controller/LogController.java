package ru.pflb.webserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pflb.webserver.controller.dto.RandomNumber;
import ru.pflb.webserver.service.Logger;
import ru.pflb.webserver.service.domain.RandomGenerator;

@RestController
public class LogController {
    @RequestMapping(value = "/log", method = RequestMethod.POST)
    public boolean log(@RequestParam(value = "log value") String log) {
        return Logger.appendToLog(log, "data.log");
    }
}
