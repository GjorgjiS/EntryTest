package com.example.demo.controllers;

import org.springframework.data.repository.CrudRepository;

public interface RepBook extends CrudRepository<Books, Integer> {
    Books findByTitle(String title);
}
