package src.lab14.pr14.src.main.java.com.example.demo.models;

import java.time.LocalDate;

public class Game {
    private String name;
    private LocalDate creationDate;

    public Game(String name, LocalDate creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
