package com.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "book_author")
public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_author_id")
    private Long bookAuthorId;

    @Id
    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author authorId;

    @Id
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book bookId;

    @Column(name = "main_author")
    @NotEmpty()
    private boolean mainAuthor;

    public Long getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(Long bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public boolean isMainAuthor() {
        return mainAuthor;
    }

    public void setMainAuthor(boolean mainAuthor) {
        this.mainAuthor = mainAuthor;
    }
}
