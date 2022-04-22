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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDeployDate() {
        return deployDate;
    }

    public int getCopyNumber() {
        return copyNumber;
    }

    public List<AuthorBook> getAuthors() {
        return authors;
    }

    public List<UserBook> getUsers() {
        return users;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeployDate(Date deployDate) {
        this.deployDate = deployDate;
    }

    public void setCopyNumber(int copyNumber) {
        this.copyNumber = copyNumber;
    }

    public void setAuthors(List<AuthorBook> authors) {
        this.authors = authors;
    }

    public void setUsers(List<UserBook> users) {
        this.users = users;
    }


}
