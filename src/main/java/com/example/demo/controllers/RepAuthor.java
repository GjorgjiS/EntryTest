package com.example.demo.controllers;

import org.springframework.data.repository.CrudRepository;

public interface RepAuthor extends CrudRepository<Authors, Integer> {
    Authors findByName(String name);
}
