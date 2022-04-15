package team6.library.javaclub6.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @OneToMany(mappedBy = "fkAuthor")
    private List<AuthorBook> books;
}
