package com.booklib.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String name;


    @Column(nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.surname.invalid}")
    @NotEmpty(message = "Please Enter your surname")
    private String surname;

    @Column( unique = true, nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.username.invalid}")
    @NotEmpty(message = "Please Enter username")
    private String username;

    @Column(unique = true)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message = "Please Enter your email")
    private String email;

    @Column(nullable = false, length = 150)
    @NotEmpty(message = "Please Enter your password")
    private String password;

    @Column(nullable = false)
//    @NotNull(message = "Please Enter Date Registration")
    private Date date_registr;

    @Column(nullable = false)
    @NotNull(message = "Please Enter Date of Birth")
    private Date birthday;

    @ManyToOne
    @JoinColumn(name = "roles ", referencedColumnName = "id")
    private Roles roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(roles.getRole()));
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
