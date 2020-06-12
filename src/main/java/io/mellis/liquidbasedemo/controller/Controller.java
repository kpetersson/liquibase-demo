package io.mellis.liquidbasedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class Controller
{
    @GetMapping
    public Mono<String> get(){
        return Mono.just("Hello World!");
    }
}
