package src.lab14.pr14.src.main.java.com.example.demo.models;

import java.time.LocalDate;

public class GameAuthor {
    private String nickname;
    private LocalDate birthDate;

    public GameAuthor(String nickname, LocalDate birthDate) {
        this.nickname = nickname;
        this.birthDate = birthDate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
