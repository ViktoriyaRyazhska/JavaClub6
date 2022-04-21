package team6.library.javaclub6.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "deploy_date")
    private Date deployDate;
    @Column(name = "copy_number")
    private int copyNumber;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "fkBook")
    @ToString.Exclude private List<AuthorBook> authors;
    @OneToMany(mappedBy = "fkBook")
    @ToString.Exclude private List<UserBook> users;
}
