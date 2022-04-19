package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "author_first_name", length = 50)
    @NotEmpty()
    private String authorFirstName;

    @Column(name = "author_last_name", length = 50)
    @NotEmpty()
    private String authorLastName;

    public Author(String s, String s1) {}

    public Author(Long authorId, String authorFirstName, String authorLastName) {
        this.authorId = authorId;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString(){
        return String.format("Author [authorId = %d, authorFirstName=%s,authorLastName=%d", authorId,authorFirstName,authorLastName);
    }
}
