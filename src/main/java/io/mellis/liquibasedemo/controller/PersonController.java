package io.mellis.liquibasedemo.controller;

import io.mellis.liquibasedemo.domain.Person;
import io.mellis.liquibasedemo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/person")
public class PersonController
{
    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @GetMapping
    public Flux<Person> get()
    {
        return personRepository.findAll();
    }
}
