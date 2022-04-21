package com.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="user_book")
@Data
public class UserBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_book_id")
    private Long userBookId;

    @Column(name="id_book")
    @NotEmpty()
    private Long idBook;

    @Column(name="id_user")
    @NotEmpty()
    private Long idUser;

    @Column(name="first_day")
    @NotEmpty()
    private Date firstDay;
    @Column(name="last_day")
    @NotEmpty()
    private Date lastDay;

    @Column(name="date_return")
    private Date dateReturn;


    public UserBook() {}

    public UserBook(Long idBook, Long idUser, Date firstDay, Date lastDay, Date dateReturn) {
        this.idBook = idBook;
        this.idUser = idUser;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.dateReturn = dateReturn;
    }


}
