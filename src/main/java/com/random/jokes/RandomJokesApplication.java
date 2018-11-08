package com.random.jokes;

import Service.FetchJoke;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomJokesApplication {

    public static void main(String[] args) {
        //System.out.println(new FetchJoke().getJoke());
        SpringApplication.run(RandomJokesApplication.class, args);
    }
}
