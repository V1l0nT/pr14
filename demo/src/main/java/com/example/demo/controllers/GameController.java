package src.lab14.pr14.demo.src.main.java.com.example.demo.controllers;

import com.example.demo.models.Game;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private List<Game> games = new ArrayList<>();

    @PostMapping
    public void createGame(@RequestBody Game game) {
        games.add(game);
    }

    @GetMapping
    public List<Game> getAllGames() {
        return games;
    }

    @DeleteMapping("/{name}")
    public void deleteGame(@PathVariable String name) {
        games.removeIf(game -> game.getName().equals(name));
    }
}