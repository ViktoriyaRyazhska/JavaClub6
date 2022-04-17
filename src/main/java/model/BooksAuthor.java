package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books_author")
public class BooksAuthor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "author", joinColumns = {@JoinColumn(name = "id")
    }, inverseJoinColumns = {
    @JoinColumn(name = "author_id")})
    private Set<Author> authors;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "books", joinColumns = {@JoinColumn(name = "id")
    }, inverseJoinColumns = {
    @JoinColumn(name = "books_id")})
    private Set<Books> books;

    @Column(name = "author_role", nullable = false)
    @NotEmpty(message = "Please Enter your author role")
    private String authorRole;

}
