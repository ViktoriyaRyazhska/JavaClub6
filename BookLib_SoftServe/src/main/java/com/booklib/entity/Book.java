package com.booklib.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private long id;

    // @Column(nullable = false, length = 250)
    // private String title;

    // @OneToMany()
    // private Set<Genre> genres;

}
