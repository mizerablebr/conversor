package com.example.conversor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/person")
@RestController
public class PersonController {

    @RequestMapping("/list/{id}")
    public Person list(@PathVariable("id") Person person) {
        return person;
    }
}
