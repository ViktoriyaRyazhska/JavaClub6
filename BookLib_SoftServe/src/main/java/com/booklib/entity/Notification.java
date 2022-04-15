package com.booklib.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message_text")
    private String message_text;

    @Column(name = "date_send")
    private Date date_send;

    @ManyToOne
    @JoinColumn(name = "id_user_send", referencedColumnName = "id")
    private User user_send;

    @ManyToOne
    @JoinColumn(name = "id_user_received", referencedColumnName = "id")
    private User user_received;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((message_text == null) ? 0 : message_text.hashCode());
        result = prime * result + ((date_send == null) ? 0 : date_send.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((user_send == null) ? 0 : user_send.hashCode());
        result = prime * result + ((user_received == null) ? 0 : user_received.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Notification other = (Notification) obj;

        if (message_text == null) {
            if (other.message_text != null)
                return false;
        } else if (!message_text.equals(other.message_text))
            return false;
        if (date_send == null) {
            if (other.date_send != null)
                return false;
        } else if (!date_send.equals(other.date_send))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (user_send == null) {
            if (other.user_send != null)
                return false;
        } else if (!user_send.equals(other.user_send))
            return false;
        if (user_received == null) {
            if (other.user_received != null)
                return false;
        } else if (!user_received.equals(other.user_received))
            return false;
        return true;
    }
}
