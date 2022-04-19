package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="user_book")
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

    public Long getUserBookId() {
        return userBookId;
    }

    public void setUserBookId(Long userBookId) {
        this.userBookId = userBookId;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Date getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(Date firstDay) {
        this.firstDay = firstDay;
    }

    public Date getLastDay() {
        return lastDay;
    }

    public void setLastDay(Date lastDay) {
        this.lastDay = lastDay;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }
}
