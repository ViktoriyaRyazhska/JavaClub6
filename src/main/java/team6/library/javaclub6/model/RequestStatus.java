package team6.library.javaclub6.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "request_status")
public class RequestStatus {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "fkStatus")
    private List<UserBook> requests;

    public List<UserBook> getRequests() {
        return requests;
    }

    public RequestStatus() {
    }

    @Override
    public String toString() {
        return "RequestStatus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
