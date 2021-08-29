package com.example.demo.controllers;
import javax.persistence.*;

@Table(name="authors")
@Entity
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String name;
    private String surname;
    private String date_birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }


    @ManyToOne
    @JoinColumn(name="book_id")
    private Books dp;

    public Books getDp() {
        return dp;
    }

    public void setDp(Books dp) {
        this.dp = dp;
    }
}
