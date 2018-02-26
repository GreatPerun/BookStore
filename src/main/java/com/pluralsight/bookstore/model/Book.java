package com.pluralsight.bookstore.model;

import com.pluralsight.bookstore.Language;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String title;
    @Column(length = 1000)
    private String description;
    private Language language;

}
