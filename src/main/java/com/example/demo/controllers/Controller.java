package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @Autowired
    RepBook BOOK;
    //    Create a new book
    @PostMapping(value = "/Create_New_Books")
    public void Create_Book(@RequestBody Books b) {
        Books obj=new Books();
        obj.setTitle(b.getTitle());
        obj.setAuthor(b.getAuthor());
        if(b.getGenre().length()==7 || b.getGenre().length()==10)
        { obj.setGenre(b.getGenre());
            BOOK.save(obj);}

    }
    //    Get all books
    @GetMapping(value = "/getAll")
    public ArrayList<Books> findAll()
    {
        return (ArrayList<Books>) BOOK.findAll();
    }
    //    Get a specific book
    @PostMapping(value = "/findByTitle")
    public Books findBooks(@RequestBody Books b)
    {
        Books obj=BOOK.findByTitle(b.getTitle());

        return obj;
    }
    //    Delete existing book
    @DeleteMapping(value = "/delete/{id}")
    public void DeleteValues(@PathVariable Integer id)
    {
        BOOK.deleteById(id);
    }
    //    Update existing book
    @PutMapping(value = "/putValue/{id}")
    public Books putValue(@PathVariable Integer id, @RequestBody Books b)
    {
        return BOOK.save(b);
    }

    //    Create a new author
    @Autowired
    RepAuthor AUTHOR;
    @PostMapping(value = "/Create_New_Author")
    public void Create_Book(@RequestBody Authors a) {
        Authors obj=new Authors();
        obj.setName(a.getName());
        obj.setSurname(a.getSurname());
        obj.setDate_birth(a.getDate_birth());
        obj.setDp(a.getDp());
        AUTHOR.save(obj);
    }
    //    Get a specific author
    @PostMapping(value = "/findByFirst_Name")
    public Authors findAuthors(@RequestBody Authors a)
    {
        Authors obj=AUTHOR.findByName(a.getName());

        return obj;
    }
}
