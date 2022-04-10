package team6.library.javaclub6.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue()
    @Column
    private int id_author;
    @Column
    private String author_name;
    @Column
    private String author_surname;

    public Author(){}

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_surname() {
        return author_surname;
    }

    public void setAuthor_surname(String author_surname) {
        this.author_surname = author_surname;
    }
    public String toString(){
        return this.id_author + " " + this.author_name + " " + this.author_surname;
    }
}
