package com.booklib.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 250, name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "copies")
    private int copies;
}
