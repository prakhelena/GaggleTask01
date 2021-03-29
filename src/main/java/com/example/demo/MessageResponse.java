package com.example.demo;

import java.time.LocalDateTime;

public class MessageResponse {

    private int id;

    private String message;

    private LocalDateTime dateTime;


    public MessageResponse(int id, String message) {
        super();
        this.id = id;
        this.message = message;
        this.dateTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDt() {
        return dateTime;
    }

    public void setDt(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }


}
