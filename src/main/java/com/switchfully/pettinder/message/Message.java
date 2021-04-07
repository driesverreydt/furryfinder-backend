package com.switchfully.pettinder.message;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name= "MESSAGE")
public class Message {
    @Id
    @SequenceGenerator(name = "message_seq", sequenceName = "message_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_seq")
    private Long id;
    private String content;
    private LocalDateTime creationDate;
    private String location;

    private Message(){

    }

    public Message(String content, String location) {
        this.content = content;
        this.creationDate = LocalDateTime.now();
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getLocation() {
        return location;
    }
}
