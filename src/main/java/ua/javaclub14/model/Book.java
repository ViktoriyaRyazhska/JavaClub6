package ua.javaclub14.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Year;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 50)
    @Size(max = 45, min = 3, message = "{books.name.invalid}")
    @NotEmpty(message = "Please Enter title")
    private String title;

    @Column(name = "realize_year", nullable = false)
    @NotEmpty(message = "Please Enter year")
    private int realizeYear;

    @Column(name = "total_quantity", nullable = false)
    @NotEmpty(message = "Please Enter total quantity")
    private int totalQuantity;

    @Column(name = "in_reading", nullable = false)
    @NotEmpty(message = "Please Enter total quantity")
    private int inReading;

    @Column(name = "last_update", nullable = false)
    @NotEmpty(message = "Please Enter last update")
    private Date lastUpdate;

    @Column(name = "role_id", nullable = false)
    @NotEmpty(message = "Please Enter author's role ")
    private Long roleId;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();
//
    @ManyToMany(mappedBy = "books")
    private Set<User> users = new HashSet<>();



}
