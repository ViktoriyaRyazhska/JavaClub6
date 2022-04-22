package team6.library.javaclub6.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "user_book")
@Data
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

    public User getFkUser() {
        return fkUser;
    }
    public Book getFkBook() {
        return fkBook;
    }
    public RequestStatus getFkStatus() {
        return fkStatus;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    public Date getRentDate() {
        return rentDate;
    }
    public Date getShouldReturnDate() {
        return shouldReturnDate;
    }
    public void setFkUser(User fkUser) {
        this.fkUser = fkUser;
    }
    public void setFkBook(Book fkBook) {
        this.fkBook = fkBook;
    }
    public void setFkStatus(RequestStatus fkStatus) {
        this.fkStatus = fkStatus;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }
    public void setShouldReturnDate(Date shouldReturnDate) {
        this.shouldReturnDate = shouldReturnDate;
    }

    @Override
    public String toString() {
        return "UserBook{" +
                "fkUser=" + fkUser +
                ", fkBook=" + fkBook +
                ", fkStatus=" + fkStatus +
                ", returnDate=" + returnDate +
                ", rentDate=" + rentDate +
                ", shouldReturnDate=" + shouldReturnDate +
                '}';
    }
}
