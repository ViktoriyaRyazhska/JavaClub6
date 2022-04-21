package ua.javaclub14.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String lastName;

    @Column(name = "email", unique = true)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message = "Please Enter your email")
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "dob", nullable = false)
    @NotEmpty(message = "Please Enter Date of Birth")
    private Date birthday;

    @Column(name = "date_registration", nullable = false)
    @NotEmpty(message = "Please Enter Date Registration")
    private Date dateRegistration;

//    @ManyToOne
//    private Role role;

//    @ManyToOne(cascade = {CascadeType.ALL})
//    @JoinTable(name = "role", joinColumns = {@JoinColumn(name = "id")
//    }, inverseJoinColumns = {
//            @JoinColumn(name = "role_id")})
//    private Role roles;

//    @ManyToMany(cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "book_user",
//            joinColumns = { @JoinColumn(name = "user_id") },
//            inverseJoinColumns = { @JoinColumn(name = "book_id") }
//    )
//    Set<Book> books = new HashSet<>();


}
