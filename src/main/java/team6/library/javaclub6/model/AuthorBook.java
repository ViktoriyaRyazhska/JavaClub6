package team6.library.javaclub6.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

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
}
