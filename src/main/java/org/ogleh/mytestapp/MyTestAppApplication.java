package org.ogleh.mytestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyTestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTestAppApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @GetMapping("/name")
    public String greeting(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
