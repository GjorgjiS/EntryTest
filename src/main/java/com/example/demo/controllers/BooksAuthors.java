package com.example.demo.controllers;
import com.example.demo.controllers.Authors;
import com.example.demo.controllers.Books;

import javax.persistence.*;

@Entity
@Table(name="Books_authors")
public class BooksAuthors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name="book_id")
    private Books bp;
    @ManyToOne
    @JoinColumn(name="author_id")
    private Authors ap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books getBp() {
        return bp;
    }

    public void setBp(Books bp) {
        this.bp = bp;
    }

    public Authors getAp() {
        return ap;
    }

    public void setAp(Authors ap) {
        this.ap = ap;
    }
}
