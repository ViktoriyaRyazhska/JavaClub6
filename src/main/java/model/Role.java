package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String role;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private Set<User> users;



}