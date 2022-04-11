/**
 * @author RoSteik (Telegram: @RoSteik)
 * Project: JavaClub
 * Package: team6.library.javaclub6.pojo
 * Class: Book
 */
package team6.library.javaclub6.pojo;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue()
    @Column
    private int id_book;
    @Column
    private String title_book;
    @Column
    private String deploy_date;
    @Column
    private int copy_number;

    @Override
    public String toString() {
        return "Book : " +
                "id_book=" + id_book +
                ", title_book='" + title_book + '\'' +
                ", deploy_date='" + deploy_date + '\'' +
                ", copy_number=" + copy_number
                ;
    }

    public Book() {
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public String getTitle_book() {
        return title_book;
    }

    public void setTitle_book(String title_book) {
        this.title_book = title_book;
    }

    public String getDeploy_date() {
        return deploy_date;
    }

    public void setDeploy_date(String deploy_date) {
        this.deploy_date = deploy_date;
    }

    public int getCopy_number() {
        return copy_number;
    }

    public void setCopy_number(int copy_number) {
        this.copy_number = copy_number;
    }
}
