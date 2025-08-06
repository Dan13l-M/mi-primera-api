package com.ejemplo.mi_primera_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController{
    @GetMapping("/hello")
    public String helloWorld(){
        return "¡Hello!, My first API is working perfectly!";
    }

    @GetMapping("/")
    public String home(){
        return "Welcome to my first API - Available endpoints: /hola, /date, /greet/{name}";
    }

    @GetMapping("/date")
    public String getCurrentDate(){
        return "Current Date: " + java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    @GetMapping("/greet/{name}")
    public String greetPersona(@PathVariable String nombre){
        return "Hello: " + nombre + " Welcome to my API";
    }
}
