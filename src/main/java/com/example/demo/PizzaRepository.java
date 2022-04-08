package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CRUD - Create Read Update Delete

public interface PizzaRepository extends CrudRepository<Pizza,Integer> {
}
