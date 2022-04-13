package team6.library.javaclub6.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "author_book")
@IdClass(AuthorBook.class)
public class AuthorBook implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_author")
    private Author fkAuthor;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_book")
    private Book fkBooks;
    @Column(name = "status")
    private boolean status;

    public AuthorBook() {
    }

    @Override
    public String toString() {
        return "AuthorBook{" +
                "fkAuthor=" + fkAuthor.toString() +
                ", fkBook=" + fkBooks.toString() +
                ", status=" + status +
                '}';
    }

    public Author getFkAuthor() {
        return fkAuthor;
    }

    public void setFkAuthor(Author fkAuthor) {
        this.fkAuthor = fkAuthor;
    }

    public Book getFkBook() {
        return fkBooks;
    }

    public void setFkBook(Book fkBook) {
        this.fkBooks = fkBook;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
