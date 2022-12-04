package com.java.spring.swagger.controller;

import com.java.spring.swagger.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ApiController {
    private static List<Person> people = List.of(
            new Person("1", "Jagadheesh", 23),
            new Person("2", "Vijaya", 22)
    );

    @GetMapping("/")
    public List<Person> getAllPeople() {
        return people;
    }

    @GetMapping("/{id}")
    public List<Person> getPersonWithID(@PathVariable String id) {
        return people.stream().filter(p -> p.getId().equals(id)).collect(Collectors.toList());
    }

    @PostMapping("/add")
    public List<Person> addPerson(@RequestBody Person person) {
        people.add(person);
        return people;
    }
}
