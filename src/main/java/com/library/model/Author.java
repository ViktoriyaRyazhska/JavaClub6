package com.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private long authorId;

    @Column(name = "first_name", nullable = false)
    String name;

    @Column(name = "last_name", nullable = false)
    String surname;

    @ManyToMany(mappedBy = "authorSet", cascade = CascadeType.PERSIST)
    private Set<Book> bookSet = new HashSet<>();

}
