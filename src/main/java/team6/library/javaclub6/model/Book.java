package team6.library.javaclub6.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "deploy_date")
    private Date deployDate;
    @Column(name = "copy_number")
    private int copyNumber;
//    @OneToMany(mappedBy = "fkBooks")
//    private List<AuthorBook> authors;
//    @OneToMany(mappedBy = "fkBook")
//    private List<UserBook> users;
    public Book() {
    }
    //public List<AuthorBook> getAuthors() {
    //    return authors;
    //}

//    public List<UserBook> getUsers() {
//        return users;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", deployDate=" + deployDate +
                ", copyNumber=" + copyNumber +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDeployDate() {
        return deployDate;
    }

    public void setDeployDate(Date deployDate) {
        this.deployDate = deployDate;
    }

    public int getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(int copyNumber) {
        this.copyNumber = copyNumber;
    }
}
