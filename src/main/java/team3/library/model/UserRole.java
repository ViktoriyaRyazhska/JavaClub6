package team3.library.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_role")
@Data
public class UserRole implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_user")
    private User fkUser;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_role")
    private Role fkRole;
}
