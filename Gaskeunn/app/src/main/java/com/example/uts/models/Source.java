package com.example.uts.models;

import java.io.Serializable;

public class Source implements Serializable {
    private String id ="", name ="";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
