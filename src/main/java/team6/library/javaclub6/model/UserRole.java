package team6.library.javaclub6.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_user")
    private User fkUser;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_role")
    private Role fkRole;

    public UserRole() {
    }

    public void setFkUser(User fkUser) {
        this.fkUser = fkUser;
    }

    public void setFkRole(Role fkRole) {
        this.fkRole = fkRole;
    }

    public User getFkUser() {
        return fkUser;
    }

    public Role getFkRole() {
        return fkRole;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "fkUser=" + fkUser +
                ", fkRole=" + fkRole +
                '}';
    }
}
