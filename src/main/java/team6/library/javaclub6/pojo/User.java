package team6.library.javaclub6.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "user")
@IdClass(User.class)
public class User implements Serializable {
    @Id
    @GeneratedValue
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
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_role")
    private UserRole fkRole;

    @OneToMany(mappedBy = "fkUser")
    private List<UserBook> books;

    public List<UserBook> getBooks() {
        return books;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", registrationDate=" + registrationDate +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fkRole=" + fkRole.toString() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrarionDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getFkRole() {
        return fkRole;
    }

    public void setFkRole(UserRole fkRole) {
        this.fkRole = fkRole;
    }
}
