package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="books_user")
public class BooksUser {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "user", joinColumns = {@JoinColumn(name = "id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "user_id")})
    private Set<User> users;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "books", joinColumns = {@JoinColumn(name = "id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "books_id")})
    private Set<Books> books;

    @Column(name = "start_date", nullable = false)
    @NotEmpty(message = "Please Enter date registration")
    private Date start_date;

    @Column(name = "start_date", nullable = true)
    private Date return_date;

}
