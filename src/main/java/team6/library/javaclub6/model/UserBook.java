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
}
