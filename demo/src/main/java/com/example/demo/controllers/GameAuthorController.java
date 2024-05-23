package src.lab14.pr14.demo.src.main.java.com.example.demo.controllers;

import com.example.demo.models.GameAuthor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class GameAuthorController {
    private List<GameAuthor> authors = new ArrayList<>();

    @PostMapping
    public void createAuthor(@RequestBody GameAuthor author) {
        authors.add(author);
    }

    @GetMapping
    public List<GameAuthor> getAllAuthors() {
        return authors;
    }

    @DeleteMapping("/{nickname}")
    public void deleteAuthor(@PathVariable String nickname) {
        authors.removeIf(author -> author.getNickname().equals(nickname));
    }
}
