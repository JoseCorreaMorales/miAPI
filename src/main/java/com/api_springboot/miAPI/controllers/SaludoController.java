package com.api_springboot.miAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class SaludoController {


    @GetMapping("/health-check")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/hello")
    public String helloWorld () {
        return "Hello";
    }


    @GetMapping("/greeting/{name}/{age}")// /{name}/{age}
    public String greeting(@PathVariable String name, @PathVariable Integer age) {
    return "Hello " + name + " with " + age;
    }

}
