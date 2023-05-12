package de.htwberlin.webtech.m1.web;

import de.htwberlin.webtech.m1.web.api.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonRestController {

    private List <Person> person;

    public PersonRestController() {
        person = new ArrayList<>();
        person.add(new Person(1, "Max", "Mustermann", false ));
        person.add(new Person(2, "Maxi", "Meier", true ));

    }

    @GetMapping(path = "/api/v1/persons")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Person> fetchPerson(){
        return (person);
    }
}
