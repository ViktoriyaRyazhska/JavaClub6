package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Year;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Books {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 50)
    @Size(max = 45, min = 3, message = "{books.name.invalid}")
    @NotEmpty(message = "Please Enter title")
    private String title;

    @Column(name = "description", nullable = true, length = 500)
    private String description;

    @Column(name = "realize_year", nullable = false)
    @NotEmpty(message = "Please Enter year")
    private Year realizeYear;

    @Column(name = "total_quantity", nullable = false)
    @NotEmpty(message = "Please Enter total quantity")
    private int totalQuantity;

    @Column(name = "total_quantity", nullable = false)
    @NotEmpty(message = "Please Enter total quantity")
    private int inReading;

    @Column(name = "last_update", nullable = false)
    @NotEmpty(message = "Please Enter last update")
    private Date lastUpdate;

    @OneToMany(mappedBy = "books")
    private Set<BooksAuthor> booksAuthors;

    @OneToMany(mappedBy = "books")
    private Set<BooksUser> booksUsers;

}
