package com.booklib.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JoinTable(name = "books_coauthors", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
            @JoinColumn(name = "author_id") })
    Set<Author> coauthors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "main_author", referencedColumnName = "id")
    private Author main_author;
}
