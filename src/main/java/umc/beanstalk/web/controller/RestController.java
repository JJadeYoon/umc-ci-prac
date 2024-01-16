package umc.beanstalk.web.controller;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm healthy!";
    }
}
