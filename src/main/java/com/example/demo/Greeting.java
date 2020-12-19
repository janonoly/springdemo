package com.example.demo;

public class Greeting {
    private final long id;
    private final String name;

    public Greeting(long id, String name){
        this.id = id;
        this.name = name;
    }
    public long getId(long id){
        return id;
    }

    public String getName() {
        return name;
    }
}
