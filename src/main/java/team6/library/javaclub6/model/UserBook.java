package team6.library.javaclub6.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "user_book")
@IdClass(UserBook.class)
public class UserBook implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_user")
    private User fkUser;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_book")
    private Book fkBook;
    @Id
    @ManyToOne
    @JoinColumn(name = "fk_status")
    private RequestStatus fkStatus;
    @Column(name = "return_date")
    private Date returnDate;
    @Column(name = "rent_date")
    private Date rentDate;
    @Column(name = "should_return_date")
    private Date shouldReturnDate;

    public UserBook() {
    }

    @Override
    public String toString() {
        return "UserBook{" +
                "fkUser=" + fkUser.toString() +
                ", fkBook=" + fkBook.toString() +
                ", fkStatus=" + fkStatus.toString() +
                ", returnDate=" + returnDate +
                ", rentDate=" + rentDate +
                ", shouldReturnDate=" + shouldReturnDate +
                '}';
    }

    public User getFkUser() {
        return fkUser;
    }

    public void setFkUser(User fkUser) {
        this.fkUser = fkUser;
    }

    public Book getFkBook() {
        return fkBook;
    }

    public void setFkBook(Book fkBook) {
        this.fkBook = fkBook;
    }

    public RequestStatus getFkStatus() {
        return fkStatus;
    }

    public void setFkStatus(RequestStatus fkStatus) {
        this.fkStatus = fkStatus;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getShouldReturnDate() {
        return shouldReturnDate;
    }

    public void setShouldReturnDate(Date shouldReturnDate) {
        this.shouldReturnDate = shouldReturnDate;
    }
}
