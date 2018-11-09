package com.random.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class RandomJokesApplication {

    public static void main(String[] args) {
        //System.out.println(new FetchJoke().getJoke());
        SpringApplication.run(RandomJokesApplication.class, args);
    }
}
