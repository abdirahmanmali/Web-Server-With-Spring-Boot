package com.firstawsapp.great;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/")
    public String greet() {
        return "<h1>Hello Abdirahman alii,  we starting our first initail spring boot assignments</h1>";
    }
}
