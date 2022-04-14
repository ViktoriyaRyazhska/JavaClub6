package com.booklib.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "book_author")
public class Book_Author {

    @Id
    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author_id;

    @Id
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book_id;

    @Column(name = "is_main")
    private boolean is_main;

    public Book_Author() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book_Author that = (Book_Author) o;
        return is_main == that.is_main && author_id.equals(that.author_id) && book_id.equals(that.book_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author_id, book_id, is_main);
    }

    @Override
    public String toString() {
        return "Book_Author{" +
                "author_id=" + author_id +
                ", book_id=" + book_id +
                ", is_main=" + is_main +
                '}';
    }
}
