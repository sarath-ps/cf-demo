package com.example.cfdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/")
public class HelloResource {

    @GetMapping(path = "/hello")
    public Mono<String> hello() {
        return Mono.just("Hello world");
    }

}


