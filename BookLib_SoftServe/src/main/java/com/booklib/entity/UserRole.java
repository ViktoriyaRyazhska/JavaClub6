package com.booklib.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Table(name = "role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String role;

}
