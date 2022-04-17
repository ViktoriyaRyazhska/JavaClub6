package team6.library.javaclub6.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "registration_date")
    private Date registrationDate;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "fkUser")
    @ToString.Exclude private List<UserRole> roles;
    @OneToMany(mappedBy = "fkUser")
    @ToString.Exclude private List<UserBook> books;
}
