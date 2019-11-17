package webapplication.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello, World!";
    }
}

