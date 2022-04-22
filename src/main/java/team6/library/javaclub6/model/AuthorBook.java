package team6.library.javaclub6.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "author_book")
@Data
public class AuthorBook implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_author")
    private Author fkAuthor;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_book")
    private Book fkBook;
    @Column(name = "status")
    private boolean status;

    public String getTitle() {
        return fkBook.getTitle();
    }

    public Date getDeployDate() {
        return fkBook.getDeployDate();
    }

    public int getCopyNumber() {
        return fkBook.getCopyNumber();
    }


    public String getName() {
        return fkAuthor.getName();
    }

    public String getSurname() {
        return fkAuthor.getSurname();
    }

    public void setFkAuthor(Author fkAuthor) {
        this.fkAuthor = fkAuthor;
    }

    public void setFkBook(Book fkBook) {
        this.fkBook = fkBook;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
