package com.example.recyclercardviewapp2;

public class Game {
    private String name;
    private String release;
    private String type;

    public Game(String name, String release, String type) {
        this.name = name;
        this.release = release;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
