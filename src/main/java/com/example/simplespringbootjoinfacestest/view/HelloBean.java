package com.example.simplespringbootjoinfacestest.view;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class HelloBean {
    private String message;

    @PostConstruct
    public void init() {
        this.message = "Hello world";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
