package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    // comment

    @Autowired
    PizzaRepository repository;

    @GetMapping("/")
    public String asdjdfgj23838index() {
        return "index";
    }

    // http://localhost:8080/add?name=4chesses&size=50
    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String name, @RequestParam Integer size) {
        Pizza pizza = new Pizza(name, size);
        repository.save(pizza);
        return "Saved successefull!!!";
    }

    // http://localhost:8080/all
    @GetMapping("/all")
    public @ResponseBody Iterable<Pizza> allPizzas() {
        return repository.findAll();
    }

}
