package com.switchfully.pettinder.message;

import java.time.LocalDateTime;

public class MessageDTO {
    private Long id;
    private String content;
    private final LocalDateTime creationDate;
    private String location;

    public MessageDTO(Long id, String content, LocalDateTime creationDate, String location) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
