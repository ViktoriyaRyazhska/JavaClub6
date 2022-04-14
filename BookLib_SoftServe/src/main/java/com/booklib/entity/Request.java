package com.booklib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_day")
    private Date first_day;

    @Column(name = "last_day")
    private Date last_day;

    @Column(name = "date_return")
    private Date date_return;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    public Request() {
    }

    public Request(Long id, Date first_day, Date last_day, Date date_return, User user, Book book) {
        this.id = id;
        this.first_day = first_day;
        this.last_day = last_day;
        this.date_return = date_return;
        this.user = user;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFirst_day() {
        return first_day;
    }

    public void setFirst_day(Date first_day) {
        this.first_day = first_day;
    }

    public Date getLast_day() {
        return last_day;
    }

    public void setLast_day(Date last_day) {
        this.last_day = last_day;
    }

    public Date getDate_return() {
        return date_return;
    }

    public void setDate_return(Date date_return) {
        this.date_return = date_return;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + ((date_return == null) ? 0 : date_return.hashCode());
        result = prime * result + ((first_day == null) ? 0 : first_day.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((last_day == null) ? 0 : last_day.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Request other = (Request) obj;
        if (book == null) {
            if (other.book != null)
                return false;
        } else if (!book.equals(other.book))
            return false;
        if (date_return == null) {
            if (other.date_return != null)
                return false;
        } else if (!date_return.equals(other.date_return))
            return false;
        if (first_day == null) {
            if (other.first_day != null)
                return false;
        } else if (!first_day.equals(other.first_day))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (last_day == null) {
            if (other.last_day != null)
                return false;
        } else if (!last_day.equals(other.last_day))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Request [book=" + book + ", date_return=" + date_return + ", first_day=" + first_day + ", id=" + id
                + ", last_day=" + last_day + ", user=" + user + "]";
    }

}
